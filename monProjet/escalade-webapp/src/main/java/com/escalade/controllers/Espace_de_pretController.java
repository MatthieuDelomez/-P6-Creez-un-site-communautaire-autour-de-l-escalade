package com.escalade.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Espace_de_pretController extends AbstractController {
    
    @RequestMapping("/espace_de_pret")
    public String espace_de_pret(){
        
        return "jsp/espace_de_pret";
    }
	
	//private EspacePretManager espace_de_pretManager = getManagerFactory().getEspace__PretManager();

}
