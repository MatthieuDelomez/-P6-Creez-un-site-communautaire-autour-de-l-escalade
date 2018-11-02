package org.projetoc.escalade.consumer.impl.dao;

import org.projetoc.escalade.consumer.contract.dao.CommentaireDao;
import org.projetoc.escalade.consumer.contract.dao.DaoFactory;
import org.projetoc.escalade.consumer.contract.dao.EspacePretDao;
import org.projetoc.escalade.consumer.contract.dao.PublicationDao;
import org.projetoc.escalade.consumer.contract.dao.SecteurDao;
import org.projetoc.escalade.consumer.contract.dao.SitesDao;
import org.projetoc.escalade.consumer.contract.dao.TopoDao;
import org.projetoc.escalade.consumer.contract.dao.UtilisateurDao;
import org.projetoc.escalade.consumer.contract.dao.VoiesDao;

/*
Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
*/

public class DaoFactoryImpl implements DaoFactory {
    
                   /* Implémentation des méthodes se trouvant dans l'interface DaoFactory */

	private CommentaireDao commentaireDao;
	public CommentaireDao getCommentaireDao() {
		return commentaireDao;
	}

	public void setCommentaireDao(CommentaireDao commentaireDao) {
		this.commentaireDao = commentaireDao;
	}

	private EspacePretDao espacePretDao;
	public EspacePretDao getEspacePretDao() {
		return espacePretDao;
	}

	public void setEspacePretDao(EspacePretDao espacePretDao) {
		this.espacePretDao = espacePretDao;
	}


	private PublicationDao publicationDao;
	public PublicationDao getPublicationDao() {
                                      /* Log console*/
                                       System.out.println("---> publicationDao : "+publicationDao);
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
                                      /* Log console*/
                                      System.out.println("---> topoDao : "+topoDao);
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
