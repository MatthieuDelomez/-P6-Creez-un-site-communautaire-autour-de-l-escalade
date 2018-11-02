package org.projetoc.escalade.model;

/*
Création des models: JavaBeans manipulés par l'application
*/
public class Voies {

                   /*Variables correspondant aux colonnes de la table Voies*/
	private String nom_voies;
	private String nom_secteur;
	private String nom_du_site;

	private Secteur nom_du_secteur;
	private Sites nom_site;

	/*Constructeur du model Voies Définition des variables*/
	public Voies(String nom_voies, String nom_secteur, String nom_du_site, Secteur nom_du_secteur, Sites nom_site) {
		super();
		this.nom_voies = nom_voies;
		this.nom_secteur = nom_secteur;
		this.nom_du_site = nom_du_site;
		this.nom_du_secteur = nom_du_secteur;
		this.nom_site = nom_site;
	}

	public Voies() {

	super();
	}
        
                   /* Création des Getters et Setters avec l'option Refactor*/
	public String getNom_voies() {
		return nom_voies;
	}

	public void setNom_voies(String nom_voies) {
		this.nom_voies = nom_voies;
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

	public Secteur getNom_du_secteur() {
		return nom_du_secteur;
	}

	public void setNom_du_secteur(Secteur nom_du_secteur) {
		this.nom_du_secteur = nom_du_secteur;
	}

	public Sites getNom_site() {
		return nom_site;
	}

	public void setNom_site(Sites nom_site) {
		this.nom_site = nom_site;
	}

}
