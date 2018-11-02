package com.escalade.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  Controller chargé de synchroniser le Model et la Vue
 *  Récupérer les données utilisateur pour les filitrer via  
 *  le model et déléguer la production de sortie à la vue.
 * @author Matthieu Delomez
 */
@Controller
public class AccueilController  extends AbstractController{
    
           // Mapping sur la page index
           @RequestMapping("/index")
           public String index(){
               
               //Retourner la page index.jsp
               return "/index";
           }
    
}
