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
public class CommentaireController extends AbstractController {
    
    // Requête Mapping sur la page commentaire
    @RequestMapping("/commentaire")
    public String commentaire(){
        
        // Retourner la page commentaire.jsp
        return "jsp/commentaire";
    }
	

}
