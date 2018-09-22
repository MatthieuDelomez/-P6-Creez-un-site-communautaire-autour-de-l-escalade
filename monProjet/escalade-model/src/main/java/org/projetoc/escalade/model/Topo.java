package org.projetoc.escalade.model;

public class Topo {

	private String ref;
	private String nom;
	private String descriptif;
	private String niveau_du_topo;
	private String type_de_topo;
	private String nom_du_site;

	private Sites nommage_du_site;
	private Publication TitrePubli;
	
	
	public Topo(String ref, String nom, String descriptif, String niveau_du_topo, String type_de_topo,
			String titre_de_publication, boolean disponible, String nom_du_site, Espace_de_Pret louableouPas,
			Sites nommage_du_site, Publication titrePubli) {
		super();
		this.ref = ref;
		this.nom = nom;
		this.descriptif = descriptif;
		this.niveau_du_topo = niveau_du_topo;
		this.type_de_topo = type_de_topo;
		this.nom_du_site = nom_du_site;
		this.nommage_du_site = nommage_du_site;
		TitrePubli = titrePubli;
	}
	
	public Topo() {
		super();
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public String getNiveau_du_topo() {
		return niveau_du_topo;
	}

	public void setNiveau_du_topo(String niveau_du_topo) {
		this.niveau_du_topo = niveau_du_topo;
	}

	public String getType_de_topo() {
		return type_de_topo;
	}

	public void setType_de_topo(String type_de_topo) {
		this.type_de_topo = type_de_topo;
	}

	


	public String getNom_du_site() {
		return nom_du_site;
	}

	public void setNom_du_site(String nom_du_site) {
		this.nom_du_site = nom_du_site;
	}

	

	public Sites getNommage_du_site() {
		return nommage_du_site;
	}

	public void setNommage_du_site(Sites nommage_du_site) {
		this.nommage_du_site = nommage_du_site;
	}

	public Publication getTitrePubli() {
		return TitrePubli;
	}

	public void setTitrePubli(Publication titrePubli) {
		TitrePubli = titrePubli;
	}

}