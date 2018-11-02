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
import org.projetoc.escalade.model.Topo;
import org.projetoc.escalade.model.Utilisateur;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *  Controller chargé de synchroniser le Model et la Vue
 *  Récupérer les données utilisateur pour les filitrer via  
 *  le model et déléguer la production de sortie à la vue.
 * @author Matthieu Delomez
 */
@Controller
public class PublicationController extends AbstractResource  {
    

      private final PublicationManager publicationManager = getManagerFactory().getPublicationManager();
      private final TopoManager topoManager = getManagerFactory().getTopoManager();


    // Requête Mapping sur la page publication
    @RequestMapping("/publication")
    // Appel à la méthode ModelAndView
    public ModelAndView publication(ModelMap modelMap) {
        
                System.out.println("---->>> get all publication");
        
                // Création de la liste des publications qui sera chargé de récupérer les données dans le Dao pour l'injecter dans la Vue
                List<Publication> listPublication = publicationManager.getAllPublication() ;
                System.out.println("---->>> get all publication: " + listPublication.size());
                
                 // Création de la liste des topos qui sera chargé de récupérer les données dans le Dao pour l'injecter dans la Vue
                List<Topo> listTopos = topoManager.getAllTopo() ;
                System.out.println("---->>> get all topo: " + listTopos.size() );
                
               
                modelMap.addAttribute("topoList", topoManager.getAllTopo());
                modelMap.addAttribute("publicationList", publicationManager.getAllPublication());
                return new ModelAndView("publication", "publication", new Publication());
        
    }
    
     /*
    Faire appel aux données souhaitées dans la Table Publication
    @ServletRequest
    @request.getParameter
    */
 @PostMapping("/publication")
        public String publication (HttpServletRequest request){
            
    /*
    Si l'utilisateur n'est pas identifié alors redirection vers la page login.jsp
    Sinon ajouter la publication réalisé par l'utilisateur dans la base de données
    */
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
            

           //Ajouter la nouvelle publication 
            publicationManager.addPublication(publication);

            return "redirect:/publication";
        }
    
}