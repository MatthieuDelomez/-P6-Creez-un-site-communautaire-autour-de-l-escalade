package org.projetoc.escalade.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Espace_de_Pret {

	private int id_pret;
	private String date_de_location;
	private String pseudo_proprio;
	private boolean disponible;
	private String ref;



	
	

	public Espace_de_Pret(int id_pret ,boolean disponible, String date_de_location, String pseudo_proprio ) {
		super();
		this.id_pret = id_pret;
		this.disponible = disponible;
		this.date_de_location = date_de_location;
		this.pseudo_proprio = pseudo_proprio;
		this.ref = ref;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Espace_de_Pret() {

	super();
	}
	
	public int getId_pret() {
		return id_pret;
	}

	public void setId_pret(int id_pret) {
		this.id_pret = id_pret;
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
