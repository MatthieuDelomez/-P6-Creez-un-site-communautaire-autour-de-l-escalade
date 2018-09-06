package org.projetoc.escalade.consumer.contract.dao;

import org.projetoc.escalade.model.Sites;

public interface SitesDao {
	
	void addSites(Sites sites);

	Sites getSites(Sites sites);

    void deleteSitesPicture(Sites sites);

    void updateSites(Sites sites);

    void deleteSites(Sites sites);

}
