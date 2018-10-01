package com.escalade.controllers;

import org.springframework.stereotype.Controller;

import Manager.TopoManager;
@Controller
public class TopoController extends AbstractController {
	
	private TopoManager topoManager = getManagerFactory().getTopoManager();
}
