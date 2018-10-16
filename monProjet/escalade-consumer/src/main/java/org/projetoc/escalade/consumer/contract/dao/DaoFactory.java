package org.projetoc.escalade.consumer.contract.dao;

public interface DaoFactory {
	
	CommentaireDao getCommentaireDao();
	
	EspacePretDao getEspacePretDao();
	    
    PublicationDao getPublicationDao();
    
    SecteurDao getSecteurDao();
    
    SitesDao getSitesDao();
    
    TopoDao getTopoDao();
    
    UtilisateurDao getUtilisateurDao();
    
    VoiesDao getVoiesDao();
    

    
    
}


