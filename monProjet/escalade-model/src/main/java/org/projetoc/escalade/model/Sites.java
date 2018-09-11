package org.projetoc.escalade.model;

public class Sites {

	private String nom_du_site;
	private int nombre_de_secteur;

	
	public Sites(String nom_du_site, int nombre_de_secteur) {
		super();
		this.nom_du_site = nom_du_site;
		this.nombre_de_secteur = nombre_de_secteur;
	}

	public Sites() {

	super();
	}

	public String getNom_du_site() {
		return nom_du_site;
	}

	public void setNom_du_site(String nom_du_site) {
		this.nom_du_site = nom_du_site;
	}

	public int getNombre_de_secteur() {
		return nombre_de_secteur;
	}

	public void setNombre_de_secteur(int nombre_de_secteur) {
		this.nombre_de_secteur = nombre_de_secteur;
	}

}
