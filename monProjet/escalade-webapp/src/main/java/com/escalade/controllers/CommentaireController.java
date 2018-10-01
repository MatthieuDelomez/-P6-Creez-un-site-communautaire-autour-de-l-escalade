package com.escalade.controllers;

import org.springframework.stereotype.Controller;

import Manager.CommentaireManager;
@Controller
public class CommentaireController extends AbstractController {
	
	private CommentaireManager commentaireManager = getManagerFactory().getCommentaireManager();

}
