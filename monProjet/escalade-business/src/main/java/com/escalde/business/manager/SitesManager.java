package com.escalde.business.manager;

import org.projetoc.escalade.model.Sites;

/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ un Site
*/

public interface SitesManager {
    
                   /* Creation des methodes qui seront implementées dans SitesManagerImpl */
	
	void addSites(Sites sites);

	Sites getSites(Sites sites);

                   void deleteSitesPicture(Sites sites);

                   void updateSites(Sites sites);

                   void deleteSites(Sites sites);


}
