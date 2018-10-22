package com.escalade.controllers;

import com.escalde.business.manager.PublicationManager;
import com.escalade.resources.AbstractResource;
import java.util.List;
import org.projetoc.escalade.model.Publication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import  com.escalde.business.manager.*;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.projetoc.escalade.model.Utilisateur;
import org.springframework.web.bind.annotation.PostMapping;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PublicationController extends AbstractResource  {
    

    
      private final PublicationManager publicationManager = getManagerFactory().getPublicationManager();
      

    @RequestMapping("/publication")
    public ModelAndView publication(ModelMap modelMap) {
        System.out.println("---->>> get all publication");
        
       List<Publication> listPublication = publicationManager.getAllPublication() ;
                System.out.println("---->>> get all publication: " + listPublication.size());

        modelMap.addAttribute("publicationList", publicationManager.getAllPublication());
        return new ModelAndView("publication", "publication", new Publication());
        
    }
    
    
 @PostMapping("/publication")
        public String publication (HttpServletRequest request){
            
    HttpSession session = request.getSession();
       if (session.getAttribute("user") == null) {
           return "redirect:/login";
       }
       
          String pseudo = ((Utilisateur) session.getAttribute("user")).getPseudo();
          Date date_maj = new Date();
            
            Publication publication = new Publication();
            publication.setDescription(request.getParameter("description"));
            publication.setDate_maj(date_maj.toString());
            publication.setPseudo(pseudo);
            publication.setTitre(request.getParameter("titre"));
            

            
                  publicationManager.addPublication(publication);

            return "redirect:/publication";
        }
    
}