package com.escalade.controllers;

import com.escalade.resources.AbstractResource;
import com.escalde.business.manager.TopoManager;
import java.util.List;
import org.projetoc.escalade.model.Topo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import  com.escalde.business.manager.*;
import org.projetoc.escalade.model.Publication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TopoController extends AbstractResource {

          private final PublicationManager publicationManager = getManagerFactory().getPublicationManager();
          private final TopoManager topoManager = getManagerFactory().getTopoManager();
    

    @RequestMapping("/topo")
    public ModelAndView topo(ModelMap modelMap) {
        System.out.println("---->>> get all topo");
        
       List<Topo> listTopos = topoManager.getAllTopo() ;
                System.out.println("---->>> get all topo: " + listTopos.size());
                
                       List<Publication> listPublication = publicationManager.getAllPublication() ;
                System.out.println("---->>> get all publication: " + listPublication.size());

        modelMap.addAttribute("topoList", topoManager.getAllTopo());
        modelMap.addAttribute("publicationList", publicationManager.getAllPublication());
        return new ModelAndView("topo", "topo", new Topo());
    }

}
