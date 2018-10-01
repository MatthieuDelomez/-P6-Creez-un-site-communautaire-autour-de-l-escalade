package com.escalade.controllers;

import org.springframework.stereotype.Controller;

import Manager.SecteurManager;

@Controller

public class SecteurController extends AbstractController{
	
	private SecteurManager secteurManager = getManagerFactory().getSecteurManager();

}
