package com.escalade.business.managerImpl;

import org.projetoc.escalade.model.Publication;

import com.escalde.business.manager.PublicationManager;
import java.util.List;

/*
Creation de la classe PublicationManagerImpl qui implemente l'interface PublicationManager
*/

public class PublicationManagerImpl extends AbstractManager implements PublicationManager{

                   /*
                   Implementation des methodes
                   */
	
	public void addPublication(Publication publication) {
		getDaoFactory().getPublicationDao().addPublication(publication);
		
	}

	public Publication getPublication(Publication publication) {
		return getDaoFactory().getPublicationDao().getPublication(publication);

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
        
                   /* Implementation de la methode liste des publications /*/
        
                   public List<Publication> getAllPublication() {
                                      System.out.println("---->>> manager getAllPublication");
                                      return getDaoFactory().getPublicationDao().getAllPublication();
                   }

}
