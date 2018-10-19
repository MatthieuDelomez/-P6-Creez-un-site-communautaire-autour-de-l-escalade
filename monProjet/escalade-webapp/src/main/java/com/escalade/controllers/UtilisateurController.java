package com.escalade.controllers;

import static com.escalade.controllers.AbstractController.getManagerFactory;
import com.escalade.resources.AbstractResource;
import com.escalde.business.manager.UtilisateurManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.projetoc.escalade.model.Utilisateur;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilisateurController extends AbstractResource {
    
    	private UtilisateurManager utilisateurManager = getManagerFactory().getUtilisateurManager();

    
        
    @RequestMapping("/utilisateur")
    public String utilisateur(){
        
        
        return "utilisateur";
        
        
        
    }
	
    @PostMapping("/inscription")
   public String inscription (HttpServletRequest request){
       
       Utilisateur utilisateur = new Utilisateur();
       utilisateur.setEmail(request.getParameter("email" ));
       utilisateur.setNom(request.getParameter("nom" ));
       utilisateur.setPrenom(request.getParameter("prenom" ));
       utilisateur.setPseudo(request.getParameter("pseudo" ));
       utilisateur.setMotPasse(request.getParameter("motpasse" ));

              
              utilisateurManager.addUser(utilisateur);

              return "redirect:/";

   }	

   @GetMapping("/inscription")
   public String initInscription(HttpServletRequest request) {
       HttpSession session = request.getSession();
       if (session.getAttribute("user") != null) {
           return "redirect:/";
       }
       return "inscription";
   }
   

}
