package com.escalade.controllers;

import com.escalade.resources.AbstractResource;
import com.escalde.business.manager.EspacePretManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.projetoc.escalade.model.EspacePret;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  Controller chargé de synchroniser le Model et la Vue
 *  Récupérer les données utilisateur pour les filitrer via  
 *  le model et déléguer la production de sortie à la vue.
 * @author Matthieu Delomez
 */
@Controller
public class Espace_de_pretController extends AbstractResource {
   
    
    private EspacePretManager espacePretManager = getManagerFactory().getEspacePretManager();

    
    // Requête Mapping sur la page espace_de_pret 
    @RequestMapping("/espace_de_pret")
    public String espacePret(){
        
        // retourner la page espace_de_pret.jsp
        return "espace_de_pret";
        
    }
    
    
    /*
    Faire appel aux données souhaitées dans la Table EspacePret 
    @ServletRequest
    @request.getParameter
    */
    @PostMapping("/espace_de_pret")
   public String espacePret (HttpServletRequest request){
       
       EspacePret espacePret = new EspacePret();
       espacePret.setDate_de_location(request.getParameter("date_de_location" ));
       espacePret.setRef(request.getParameter("ref" ));
       espacePret.setPseudo_proprio(request.getParameter("pseudo_proprio" ));

              // On ajoute un espace de pret dans la base
              espacePretManager.addEspacePret(espacePret);


              return "redirect:/";

   }	

   /*
   Methode pour dicter les conditions de prêt:
   Si l'utilisateur n'est pas identifié alors rediriger vers Login
   Sinon retourner retourner la page espace_de_pret.jsp
   @GetMapping
   */
   @GetMapping("/espace_de_pret")
   public String initEspacePret(HttpServletRequest request) {
       HttpSession session = request.getSession();
       if (session.getAttribute("user") == null) {
           return "redirect:/login";
       }
       return "espace_de_pret";
   

}
      
}