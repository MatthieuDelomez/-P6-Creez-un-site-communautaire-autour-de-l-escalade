package org.projetoc.escalade.consumer.contract.dao;

/*
Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
*/

public interface DaoFactory {
    
                   /* Creation des methodes Dao qui seront implementées dans DaoFactoryImpl*/
	
	CommentaireDao getCommentaireDao();
	
	EspacePretDao getEspacePretDao();
	    
                   PublicationDao getPublicationDao();
    
                   SecteurDao getSecteurDao();
    
                   SitesDao getSitesDao();
    
                   TopoDao getTopoDao();
    
                   UtilisateurDao getUtilisateurDao();
    
                   VoiesDao getVoiesDao();
    

    
    
}


