package com.escalade.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SitesController extends AbstractController {
    
     @RequestMapping("/sites")
     public String sites(){
         
         return "jsp/sites";
    }
	

}
