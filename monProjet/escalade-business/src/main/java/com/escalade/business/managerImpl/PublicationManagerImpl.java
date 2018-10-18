package com.escalade.business.managerImpl;

import org.projetoc.escalade.model.Publication;

import com.escalde.business.manager.PublicationManager;
import java.util.List;

public class PublicationManagerImpl extends AbstractManager implements PublicationManager{

	
	public void addPublication(Publication publication) {
		getDaoFactory().getPublicationDao().addPublication(publication);
		
	}

	public Publication getPublication(Publication publication) {
		return getDaoFactory().getPublicationDao().getPublication(publication);

	}

                    public List<Publication> getAllPublication() {
        
                                      System.out.println("---->>> manager getAllPublication");
                                      return getDaoFactory().getPublicationDao().getAllPublication();
                   }
        
	public void deletePublicationPicture(Publication publication) {
		getDaoFactory().getPublicationDao().deletePublicationPicture(publication);
		
	}

	public void updatePublication(Publication publication) {
		getDaoFactory().getPublicationDao().updatePublication(publication);
		
	}

	
	public void deletePublication(Publication publication) {
		getDaoFactory().getPublicationDao().deletePublication(publication);
		
	}

}
