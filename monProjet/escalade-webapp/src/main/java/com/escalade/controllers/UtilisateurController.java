package com.escalade.controllers;

import org.springframework.stereotype.Controller;

import com.escalde.manager.UtilisateurManager;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilisateurController extends AbstractController {
    
    @RequestMapping("/utilisateur")
    public String utilisateur(){
        
        return "jsp/utilisateur";
    }
	
	//private UtilisateurManager utilisateurManager = getManagerFactory().getUtilisateurManager();
	


}
