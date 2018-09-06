package org.projetoc.escalade.model;

public class Publication {

	private String titre;
	private String description;
	private String date_maj;
	private String pseudo;

	private Utilisateur author;

	
	public Publication(String titre, String description, String date_maj, String pseudo, Utilisateur author) {
		super();
		this.titre = titre;
		this.description = description;
		this.date_maj = date_maj;
		this.pseudo = pseudo;
		this.author = author;
	}

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
