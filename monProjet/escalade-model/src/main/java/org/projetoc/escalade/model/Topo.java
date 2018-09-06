package org.projetoc.escalade.model;

public class Topo {

	private String ref;
	private String nom;
	private String descriptif;
	private String niveau_du_topo;
	private String titre_de_publication;
	private boolean disponible;
	private String nom_du_site;

	private Espace_de_Pret louableouPas;
	private Sites nommage_du_site;
	private Publication TitrePubli;

	
	public Topo(String ref, String nom, String descriptif, String niveau_du_topo, String titre_de_publication,
			boolean disponible, String nom_du_site, Espace_de_Pret louableouPas, Sites nommage_du_site,
			Publication titrePubli) {
		super();
		this.ref = ref;
		this.nom = nom;
		this.descriptif = descriptif;
		this.niveau_du_topo = niveau_du_topo;
		this.titre_de_publication = titre_de_publication;
		this.disponible = disponible;
		this.nom_du_site = nom_du_site;
		this.louableouPas = louableouPas;
		this.nommage_du_site = nommage_du_site;
		TitrePubli = titrePubli;
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

	public String getTitre_de_publication() {
		return titre_de_publication;
	}

	public void setTitre_de_publication(String titre_de_publication) {
		this.titre_de_publication = titre_de_publication;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getNom_du_site() {
		return nom_du_site;
	}

	public void setNom_du_site(String nom_du_site) {
		this.nom_du_site = nom_du_site;
	}

	public Espace_de_Pret getLouableouPas() {
		return louableouPas;
	}

	public void setLouableouPas(Espace_de_Pret louableouPas) {
		this.louableouPas = louableouPas;
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
