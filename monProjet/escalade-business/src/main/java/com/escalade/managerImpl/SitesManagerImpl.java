package com.escalade.managerImpl;

import org.projetoc.escalade.model.Sites;

import com.escalde.manager.SitesManager;

public class SitesManagerImpl extends AbstractManager implements SitesManager{

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
