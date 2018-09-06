package org.projetoc.escalade.consumer.contract.dao;

import org.projetoc.escalade.model.Publication;

public interface PublicationDao {

	void addPublication(Publication publication);

	Publication getPublication(Publication publication);

	void deletePublicationPicture(Publication publication);

	void updatePublication(Publication publication);

	void deletePublication(Publication publication);

}
