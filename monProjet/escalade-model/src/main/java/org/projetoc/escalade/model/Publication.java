package org.projetoc.escalade.model;

/*
Création des models: JavaBeans manipulés par l'application
*/
public class Publication {

                   /*Variables correspondant aux colonnes de la table Publication*/
	private String titre;
	private String description;
	private String date_maj;
	private String pseudo;

	private Utilisateur author;

	/*Constructeur du model Publication| Définition des variables*/
	public Publication(String titre, String description, String date_maj, String pseudo, Utilisateur author) {
		super();
		this.titre = titre;
		this.description = description;
		this.date_maj = date_maj;
		this.pseudo = pseudo;
		this.author = author;
	}

	public Publication() {

	super();
	}
        
        
                   /* Création des Getters et Setters avec l'option Refactor*/
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate_maj() {
		return date_maj;
	}

	public void setDate_maj(String date_maj) {
		this.date_maj = date_maj;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public Utilisateur getAuthor() {
		return author;
	}

	public void setAuthor(Utilisateur author) {
		this.author = author;
	}

}
