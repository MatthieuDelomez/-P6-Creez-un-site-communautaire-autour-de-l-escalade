package org.projetoc.escalade.model;

import java.util.Date;

/*
Création des models: JavaBeans manipulés par l'application
*/

public class Commentaire {
    
                   /*Variables correspondant aux colonnes de la table Commentaire*/

	private int id;
	private String pseudo;
	private int publicationId;
	private String titre;
	
	/*Constructeur du model Commentaire | Définition des variables*/
	public Commentaire(int id, String pseudo, int publicationId, String titre, Date createdAt) {
		super();
		this.id = id;
		this.pseudo = pseudo;
		this.publicationId = publicationId;
		this.titre = titre;
		this.createdAt = createdAt;
		
	}
	
	public Commentaire() {
		super();
	}
	
	
                   /* Création des Getters et Setters avec l'option Refactor*/
        
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public int getPublicationId() {
		return publicationId;
	}
	public void setPublicationId(int publicationId) {
		this.publicationId = publicationId;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	private Date createdAt;




	

}
