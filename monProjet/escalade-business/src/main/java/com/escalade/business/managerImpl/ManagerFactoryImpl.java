package com.escalade.business.managerImpl;

import com.escalde.business.manager.*;

public class ManagerFactoryImpl implements ManagerFactory {

	private CommentaireManager commentaireManager;
	public CommentaireManager getCommentaireManager() {return this.commentaireManager;}
	public void setCommentaireManager(CommentaireManager commentaireManager) {this.commentaireManager = commentaireManager;}

	private EspacePretManager espacePretManager;
	public EspacePretManager getEspacePretManager() {return this.espacePretManager;}
	public void setEspacePretManager(EspacePretManager espacePretManager) {this.espacePretManager = espacePretManager;}

	private PublicationManager publicationManager;
	public PublicationManager getPublicationManager() {return this.publicationManager;}
	public void setPublicationManager(PublicationManager publicationManager) {this.publicationManager = publicationManager;}

	private SecteurManager secteurManager;
	public SecteurManager getSecteurManager() {return this.secteurManager;}
	public void setSecteurManager(SecteurManager secteurManager) {
		this.secteurManager = secteurManager;
	}


	private SitesManager sitesManager;
	public SitesManager getSitesManager() {return this.sitesManager;}
	public void setSitesManager(SitesManager sitesManager) {
		this.sitesManager = sitesManager;
	}


	private TopoManager topoManager;
	public TopoManager getTopoManager() {return this.topoManager;}
	public void setTopoManager(TopoManager topoManager) {
		this.topoManager = topoManager;
	}


	private UtilisateurManager utilisateurManager;
	public UtilisateurManager getUtilisateurManager() {return this.utilisateurManager;}
	public void setUtilisateurManager(UtilisateurManager utilisateurManager) {this.utilisateurManager = utilisateurManager;}

	private VoiesManager voiesManager;
	public VoiesManager getVoiesManager() {return this.voiesManager;}
	public void setVoiesManager(VoiesManager voiesManager) {
		this.voiesManager = voiesManager;
	}

}