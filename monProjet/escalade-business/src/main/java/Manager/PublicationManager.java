package Manager;

import org.projetoc.escalade.model.Publication;

public interface PublicationManager {

	void addPublication(Publication publication);

	Publication getPublication(Publication publication);

	void deletePublicationPicture(Publication publication);

	void updatePublication(Publication publication);

	void deletePublication(Publication publication);

}
