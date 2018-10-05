package com.escalde.manager;

import org.projetoc.escalade.model.Sites;

public interface SitesManager {
	
	void addSites(Sites sites);

	Sites getSites(Sites sites);

    void deleteSitesPicture(Sites sites);

    void updateSites(Sites sites);

    void deleteSites(Sites sites);


}
