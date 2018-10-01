package com.escalade.controllers;

import org.springframework.stereotype.Controller;

import Manager.PublicationManager;
@Controller

public class PublicationController extends AbstractController {
	
	private PublicationManager publicationManager = getManagerFactory().getPublicationManager();

}
