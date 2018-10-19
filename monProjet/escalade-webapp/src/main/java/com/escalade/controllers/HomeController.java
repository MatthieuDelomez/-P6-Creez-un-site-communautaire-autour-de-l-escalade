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
public class HomeController extends AbstractResource  {
    
    private final UtilisateurManager utilisateurManager = getManagerFactory().getUtilisateurManager();
	
	@RequestMapping("/login")
	public String welcome() {
		
            System.out.println("------->>>>> tonux text");
		return "login";
		
	}
        
        @PostMapping("/login")
        public String login (HttpServletRequest request){
            
            Utilisateur utilisateur = new Utilisateur();
            utilisateur.setEmail(request.getParameter("email"));
            utilisateur.setMotPasse(request.getParameter("motpasse"));
            
            utilisateurManager.getUser(utilisateur);
            return "redirect:/";
        }
	
        
           @GetMapping("/login")
   public String initInscription(HttpServletRequest request) {
       HttpSession session = request.getSession();
       if (session.getAttribute("user") != null) {
           return "redirect:/";
       }
       return "login";
   }
}
