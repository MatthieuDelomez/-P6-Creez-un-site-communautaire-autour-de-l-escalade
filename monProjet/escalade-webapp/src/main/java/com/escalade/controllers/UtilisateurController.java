package com.escalade.controllers;

import org.springframework.stereotype.Controller;

import Manager.UtilisateurManager;

@Controller
public class UtilisateurController extends AbstractController {
	
	private UtilisateurManager utilisateurManager = getManagerFactory().getUtilisateurManager();
	


}
