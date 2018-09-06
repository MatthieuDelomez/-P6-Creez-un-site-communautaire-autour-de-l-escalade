package org.projetoc.escalade.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Espace_de_Pret {

	private boolean disponible;
	private String date_de_location;
	private String authorProprio;

	private Utilisateur author;

	
	public Espace_de_Pret(boolean disponible, String date_de_location, String authorProprio, Utilisateur author) {
		super();
		this.disponible = disponible;
		this.date_de_location = date_de_location;
		this.authorProprio = authorProprio;
		this.author = author;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getDate_de_location() {
		return date_de_location;
	}

	public void setDate_de_location(String date_de_location) {
		this.date_de_location = date_de_location;
	}

	public String getAuthorProprio() {
		return authorProprio;
	}

	public void setAuthorProprio(String authorProprio) {
		this.authorProprio = authorProprio;
	}

	public Utilisateur getAuthor() {
		return author;
	}

	public void setAuthor(Utilisateur author) {
		this.author = author;
	}

}
