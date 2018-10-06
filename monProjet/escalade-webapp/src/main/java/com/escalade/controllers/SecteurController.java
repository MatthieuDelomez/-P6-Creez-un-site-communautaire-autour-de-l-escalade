package com.escalade.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecteurController extends AbstractController{
    
     @RequestMapping("/secteur")
     public String secteur(){
         
         return "jsp/secteur";
     }
	
	//private SecteurManager secteurManager = getManagerFactory().getSecteurManager();

}
