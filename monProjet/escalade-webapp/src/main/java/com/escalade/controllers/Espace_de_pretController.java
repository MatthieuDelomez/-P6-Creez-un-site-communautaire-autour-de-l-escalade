package com.escalade.controllers;

import org.springframework.stereotype.Controller;

import Manager.Espace_de_PretManager;
@Controller

public class Espace_de_pretController extends AbstractController {
	
	private Espace_de_PretManager espace_de_pretManager = getManagerFactory().getEspace_de_PretManager();

}
