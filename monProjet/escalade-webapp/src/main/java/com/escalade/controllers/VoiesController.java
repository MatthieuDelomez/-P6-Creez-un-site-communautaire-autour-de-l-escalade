package com.escalade.controllers;

import org.springframework.stereotype.Controller;

import com.escalde.manager.VoiesManager;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VoiesController extends AbstractController {
    
    @RequestMapping("/voies")
    public String voies(){
        
        return ("jsp/voies");
    }
	
	//private VoiesManager voiesManager = getManagerFactory().getVoiesManager();

}
