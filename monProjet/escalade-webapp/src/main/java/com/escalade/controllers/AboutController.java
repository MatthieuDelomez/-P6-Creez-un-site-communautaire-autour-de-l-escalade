/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escalade.controllers;

import com.escalde.business.manager.TopoManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Ben Gourion
 */
@Controller
public class AboutController extends AbstractController {
    
    
    @RequestMapping("/about")
    public String about(){
        
        return "about";
    }
    
}
