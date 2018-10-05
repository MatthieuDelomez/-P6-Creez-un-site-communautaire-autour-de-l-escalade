package com.escalade.managerImpl;

import com.escalde.manager.CommentaireManager;
import com.escalde.manager.Espace_de_PretManager;
import com.escalde.manager.ManagerFactory;
import com.escalde.manager.PublicationManager;
import com.escalde.manager.SecteurManager;
import com.escalde.manager.SitesManager;
import com.escalde.manager.TopoManager;
import com.escalde.manager.UtilisateurManager;
import com.escalde.manager.VoiesManager;

public class ManagerFactoryImpl extends AbstractManager implements ManagerFactory{

	private CommentaireManager commentaireManager;
	public CommentaireManager getCommentaireManager() {
		// TODO Auto-generated method stub
		return this.commentaireManager;
	}

	private Espace_de_PretManager espace_de_PretManager;
	public Espace_de_PretManager getEspace_de_PretManager() {
		// TODO Auto-generated method stub
		return espace_de_PretManager;
	}

	private PublicationManager publicationManager;
	public PublicationManager getPublicationManager() {
		// TODO Auto-generated method stub
		return publicationManager;
	}

	private SecteurManager secteurManager;
	public SecteurManager getSecteurManager() {
		// TODO Auto-generated method stub
		return secteurManager;
	}

	private SitesManager sitesManager;
	public SitesManager getSitesManager() {
		// TODO Auto-generated method stub
		return sitesManager;
	}

	private TopoManager topoManager;
	public TopoManager getTopoManager() {
		// TODO Auto-generated method stub
		return topoManager;
	}

	private UtilisateurManager utilisateurManager;
	public UtilisateurManager getUtilisateurManager() {
		// TODO Auto-generated method stub
		return utilisateurManager;
	}

	private VoiesManager voiesManager;
	public VoiesManager getVoiesManager() {
		// TODO Auto-generated method stub
		return voiesManager;
	}

    public void setCommentaireManager(CommentaireManager commentaireManager) {
        this.commentaireManager = commentaireManager;
    }

    public void setEspace_de_pretManager(Espace_de_PretManager espace_de_pretManager) {
        this.espace_de_PretManager = espace_de_pretManager;
    }

    public void setPublicationManager(PublicationManager publicationManager) {
        this.publicationManager = publicationManager;
    }

    public void setSecteurManager(SecteurManager secteurManager) {
        this.secteurManager = secteurManager;
    }

    public void setSitesManager(SitesManager sitesManager) {
        this.sitesManager = sitesManager;
    }

    public void setTopoManager(TopoManager topoManager) {
        this.topoManager = topoManager;
    }

    public void setUtilisateurManager(UtilisateurManager utilisateurManager) {
        this.utilisateurManager = utilisateurManager;
    }

    public void setVoiesManager(VoiesManager voiesManager) {
        this.voiesManager = voiesManager;
    }

}