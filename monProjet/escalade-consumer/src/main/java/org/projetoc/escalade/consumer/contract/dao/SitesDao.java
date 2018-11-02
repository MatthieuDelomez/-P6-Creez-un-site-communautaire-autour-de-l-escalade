package org.projetoc.escalade.consumer.contract.dao;

import org.projetoc.escalade.model.Sites;

/*
Creation du pattern Dao (Data Access Objet) pour communiquer avec la base de données via l'interface SitesDao
*/

public interface SitesDao {
    
                   /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/
	
	void addSites(Sites sites);

	Sites getSites(Sites sites);

                   void deleteSitesPicture(Sites sites);

                   void updateSites(Sites sites);

                   void deleteSites(Sites sites);

}
