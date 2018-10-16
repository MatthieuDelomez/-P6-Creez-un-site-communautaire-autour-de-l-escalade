package com.escalade.controllers;

import com.escalade.resources.AbstractResource;
import com.escalde.business.manager.TopoManager;
import java.util.List;
import org.projetoc.escalade.model.Topo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import  com.escalde.business.manager.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TopoController extends AbstractResource {

    private final TopoManager topoManager = getManagerFactory().getTopoManager();

    @RequestMapping("/topo")
    public ModelAndView topo(ModelMap modelMap) {
        System.out.println("---->>> get all topo");
        
        modelMap.addAttribute("topoList", topoManager.getAllTopo());
        return new ModelAndView("topo", "topo", new Topo());
    }

}
