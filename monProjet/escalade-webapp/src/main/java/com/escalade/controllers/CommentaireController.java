package com.escalade.controllers;

import org.springframework.stereotype.Controller;

import com.escalde.manager.CommentaireManager;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CommentaireController extends AbstractController {
    
    @RequestMapping("/commentaire")
    public String commentaire(){
        
        return "jsp/commentaire";
    }
	
	//private CommentaireManager commentaireManager = getManagerFactory().getCommentaireManager();

}
