package com.escalade.controllers;

import org.springframework.stereotype.Controller;

import Manager.SitesManager;
@Controller

public class SitesController extends AbstractController {
	
	private SitesManager sitesManager = getManagerFactory().getSitesManager();

}
