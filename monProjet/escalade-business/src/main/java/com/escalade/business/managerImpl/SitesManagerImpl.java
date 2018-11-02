package com.escalade.business.managerImpl;

import org.projetoc.escalade.model.Sites;

import com.escalde.business.manager.SitesManager;

/*
Creation de la classe SitesManagerImpl qui implemente l'interface SitesManager
*/

public class SitesManagerImpl extends AbstractManager implements SitesManager{
    
                   /*
                   Implementation des methodes
                   */

	@Override
	public void addSites(Sites sites) {
		getDaoFactory().getSitesDao().addSites(sites);
		
	}

	@Override
	public Sites getSites(Sites sites) {
	return	getDaoFactory().getSitesDao().getSites(sites);

	}

	@Override
	public void deleteSitesPicture(Sites sites) {
		getDaoFactory().getSitesDao().deleteSitesPicture(sites);
		
	}

	@Override
	public void updateSites(Sites sites) {
		getDaoFactory().getSitesDao().updateSites(sites);
		
	}

	@Override
	public void deleteSites(Sites sites) {
		getDaoFactory().getSitesDao().deleteSites(sites);
		
	}

}
