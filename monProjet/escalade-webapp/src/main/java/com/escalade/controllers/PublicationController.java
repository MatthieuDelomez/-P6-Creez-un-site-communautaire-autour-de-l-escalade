package com.escalade.controllers;

import org.springframework.stereotype.Controller;

import com.escalde.manager.PublicationManager;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicationController extends AbstractController {
    
    @RequestMapping("/publication")
    public String publication(){
        
        return "jsp/publication";
    }
	
	//private PublicationManager publicationManager = getManagerFactory().getPublicationManager();

}
