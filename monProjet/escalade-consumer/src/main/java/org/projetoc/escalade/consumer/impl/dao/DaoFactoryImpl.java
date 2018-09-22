package org.projetoc.escalade.consumer.impl.dao;

import org.projetoc.escalade.consumer.contract.dao.CommentaireDao;
import org.projetoc.escalade.consumer.contract.dao.DaoFactory;
import org.projetoc.escalade.consumer.contract.dao.Espace_de_PretDao;
import org.projetoc.escalade.consumer.contract.dao.PublicationDao;
import org.projetoc.escalade.consumer.contract.dao.SecteurDao;
import org.projetoc.escalade.consumer.contract.dao.SitesDao;
import org.projetoc.escalade.consumer.contract.dao.TopoDao;
import org.projetoc.escalade.consumer.contract.dao.UtilisateurDao;
import org.projetoc.escalade.consumer.contract.dao.VoiesDao;

public class DaoFactoryImpl implements DaoFactory {

	private CommentaireDao commentaireDao;

	public CommentaireDao getCommentaireDao() {
		return commentaireDao;
	}

	public void setCommentaireDao(CommentaireDao commentaireDao) {
		this.commentaireDao = commentaireDao;
	}

	
	
	private Espace_de_PretDao espace_de_PretDao;

	public Espace_de_PretDao getEspace_de_PretDao() {
		return espace_de_PretDao;
	}

	public void setEspace_de_PretDao(Espace_de_PretDao espace_de_PretDao) {
		this.espace_de_PretDao = espace_de_PretDao;
	}
	
	

	private PublicationDao publicationDao;

	public PublicationDao getPublicationDao() {
		return publicationDao;
	}

	public void setPublicationDao(PublicationDao publicationDao) {
		this.publicationDao = publicationDao;
	}

	
	
	private SecteurDao secteurDao;

	public SecteurDao getSecteurDao() {
		return secteurDao;
	}

	public void setSecteurDao(SecteurDao secteurDao) {
		this.secteurDao = secteurDao;
	}

	
	
	private SitesDao sitesDao;

	public SitesDao getSitesDao() {
		return sitesDao;
	}

	public void setSitesDao(SitesDao sitesDao) {
		this.sitesDao = sitesDao;
	}
	
	

	private TopoDao topoDao;

	public TopoDao getTopoDao() {
		return topoDao;
	}

	public void setTopoDao(TopoDao topoDao) {
		this.topoDao = topoDao;
	}

	
	
	private VoiesDao voiesDao;

	public VoiesDao getVoiesDao() {
		return voiesDao;
	}

	public void setVoiesDao(VoiesDao voiesDao) {
		this.voiesDao = voiesDao;
	}
	
	

	private UtilisateurDao utilisateurDao;

	public UtilisateurDao getUtilisateurDao() {
		return utilisateurDao;
	}

	public void setUtilisateurDao(UtilisateurDao utilisateurDao) {
		this.utilisateurDao = utilisateurDao;
	}

}
