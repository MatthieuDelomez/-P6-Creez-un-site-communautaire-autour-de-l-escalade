package org.projetoc.escalade.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Espace_de_Pret {

	private boolean disponible;
	private String date_de_location;
	private String pseudo_proprio;


	
	public Espace_de_Pret(boolean disponible, String date_de_location, String pseudo_proprio ) {
		super();
		this.disponible = disponible;
		this.date_de_location = date_de_location;
		this.pseudo_proprio = pseudo_proprio;
	}

	public Espace_de_Pret() {

	super();
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

	public String getPseudo_proprio() {
		return pseudo_proprio;
	}

	public void setPseudo_proprio(String pseudo_proprio) {
		this.pseudo_proprio = pseudo_proprio;
	}

	
}
