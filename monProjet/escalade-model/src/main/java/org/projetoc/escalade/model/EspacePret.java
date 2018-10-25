package org.projetoc.escalade.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EspacePret {

	private String date_de_location;
	private String pseudo_proprio;
	private String ref;


	

	public EspacePret(int id_pret , boolean disponible, String date_de_location, String pseudo_proprio ) {
		super();
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

	public EspacePret() {

	super();
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
