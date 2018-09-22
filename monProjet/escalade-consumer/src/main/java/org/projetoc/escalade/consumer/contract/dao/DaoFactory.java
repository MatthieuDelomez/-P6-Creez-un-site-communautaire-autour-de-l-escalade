package org.projetoc.escalade.consumer.contract.dao;

public interface DaoFactory {
	
	CommentaireDao getCommentaireDao();
	
	Espace_de_PretDao getEspace_de_PretDao();
	    
    PublicationDao getPublicationDao();
    
    SecteurDao getSecteurDao();
    
    SitesDao getSitesDao();
    
    TopoDao getTopoDao();
    
    UtilisateurDao getUtilisateurDao();
    
    VoiesDao getVoiesDao();
    

    
    
}


