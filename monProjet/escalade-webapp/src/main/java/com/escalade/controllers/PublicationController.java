package com.escalade.controllers;

import com.escalde.business.manager.PublicationManager;
import com.escalade.resources.AbstractResource;
import java.util.List;
import org.projetoc.escalade.model.Publication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import  com.escalde.business.manager.*;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PublicationController extends AbstractResource  {
    

    
      private final PublicationManager publicationManager = getManagerFactory().getPublicationManager();

    @RequestMapping("/publication")
    public ModelAndView publication(ModelMap modelMap) {
        System.out.println("---->>> get all publication");
        
       List<Publication> listPublication = publicationManager.getAllPublication() ;
                System.out.println("---->>> get all publication: " + listPublication.size());

        modelMap.addAttribute("publicationList", publicationManager.getAllPublication());
        return new ModelAndView("publication", "publication", new Publication());
        
    }
}