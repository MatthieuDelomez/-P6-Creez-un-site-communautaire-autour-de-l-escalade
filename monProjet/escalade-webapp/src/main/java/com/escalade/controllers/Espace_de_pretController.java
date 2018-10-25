package com.escalade.controllers;

import com.escalade.resources.AbstractResource;
import com.escalde.business.manager.EspacePretManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.projetoc.escalade.model.EspacePret;
import org.projetoc.escalade.model.Publication;
import org.projetoc.escalade.model.Utilisateur;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Espace_de_pretController extends AbstractResource {
   
      private EspacePretManager espacePretManager = getManagerFactory().getEspacePretManager();

    
        
    @RequestMapping("/espace_de_pret")
    public String espacePret(){
        
        
        return "espace_de_pret";
        
        
        
    }
	
    @PostMapping("/espace_de_pret")
   public String espacePret (HttpServletRequest request){
       
       EspacePret espacePret = new EspacePret();
       espacePret.setDate_de_location(request.getParameter("date_de_location" ));
       espacePret.setRef(request.getParameter("ref" ));
       espacePret.setPseudo_proprio(request.getParameter("pseudo_proprio" ));



              
              espacePretManager.addEspacePret(espacePret);

              return "redirect:/";

   }	

   @GetMapping("/espace_de_pret")
   public String initEspacePret(HttpServletRequest request) {
       HttpSession session = request.getSession();
       if (session.getAttribute("user") == null) {
           return "redirect:/login";
       }
       return "espace_de_pret";
   

}
      
      /*
      
       @PostMapping("/espace_de_pret")
        public String espacePret (HttpServletRequest request){
            
    HttpSession session = request.getSession();
       if (session.getAttribute("user") == null) {
           return "redirect:/login";
       }
       
          String pseudo = ((Utilisateur) session.getAttribute("user")).getPseudo();
            
            EspacePret espacePret = new EspacePret();
           espacePret.setDate_de_location(request.getParameter("description"));
           espacePret.setDisponible(true);
            espacePret.setId_pret(3);
           espacePret.setPseudo_proprio(request.getParameter("pseudo_proprio"));
           espacePret.setRef(request.getParameter("ref"));

            
                  espacePretManager.addEspacePret(espacePret);

            return "redirect:/espace_de_pret";
      
}
        */
}