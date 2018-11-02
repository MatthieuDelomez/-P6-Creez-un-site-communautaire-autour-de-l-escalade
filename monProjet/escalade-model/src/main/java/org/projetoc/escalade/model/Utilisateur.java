package org.projetoc.escalade.model;

/*
Création des models: JavaBeans manipulés par l'application
*/

public class Utilisateur {

                   /*Variables correspondant aux colonnes de la table Utilisateur*/
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
                   private String motPasse;

	
	/*Constructeur du model Utilisateur Définition des variables*/
	public Utilisateur(String pseudo, String nom, String prenom, String email, String motPasse) {
		super();
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
                                      this.motPasse = motPasse;
	}
	
	public Utilisateur() {
		super();
	}
        
                   /* Création des Getters et Setters avec l'option Refactor*/
	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
        	public String getMotPasse() {
		return motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}


}
