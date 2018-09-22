package ManagerImpl;

import org.projetoc.escalade.model.Publication;

import Manager.PublicationManager;

public class PublicationManagerImpl extends AbstractManager implements PublicationManager{

	@Override
	public void addPublication(Publication publication) {
		getDaoFactory().getPublicationDao().addPublication(publication);
		
	}

	@Override
	public Publication getPublication(Publication publication) {
		return getDaoFactory().getPublicationDao().getPublication(publication);

	}

	@Override
	public void deletePublicationPicture(Publication publication) {
		getDaoFactory().getPublicationDao().deletePublicationPicture(publication);
		
	}

	@Override
	public void updatePublication(Publication publication) {
		getDaoFactory().getPublicationDao().updatePublication(publication);
		
	}

	@Override
	public void deletePublication(Publication publication) {
		getDaoFactory().getPublicationDao().deletePublication(publication);
		
	}

}
