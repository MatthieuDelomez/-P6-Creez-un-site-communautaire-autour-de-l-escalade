package com.escalade.controllers;

import org.springframework.stereotype.Controller;

import com.escalde.manager.TopoManager;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TopoController extends AbstractController {
    
    	// private TopoManager topoManager = getManagerFactory().getTopoManager();

    
                   @RequestMapping("/topo")
                   public String topo(){
                       
                   //    topoManager.getAllTopo();
                       
                       return "jsp/topo";
                   }
	
}
