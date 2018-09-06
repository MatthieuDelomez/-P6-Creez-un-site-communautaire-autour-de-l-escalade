package org.projetoc.escalade.model;

public class Secteur {

	private String nom_secteur;
	private String nom_du_site;

	private Sites nameSecteur;

	
	public Secteur(String nom_secteur, String nom_du_site, Sites nameSecteur) {
		super();
		this.nom_secteur = nom_secteur;
		this.nom_du_site = nom_du_site;
		this.nameSecteur = nameSecteur;
	}

	public String getNom_secteur() {
		return nom_secteur;
	}

	public void setNom_secteur(String nom_secteur) {
		this.nom_secteur = nom_secteur;
	}

	public String getNom_du_site() {
		return nom_du_site;
	}

	public void setNom_du_site(String nom_du_site) {
		this.nom_du_site = nom_du_site;
	}

	public Sites getNameSecteur() {
		return nameSecteur;
	}

	public void setNameSecteur(Sites nameSecteur) {
		this.nameSecteur = nameSecteur;
	}

}
