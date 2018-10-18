package com.escalde.business.manager;

import java.util.List;
import org.projetoc.escalade.model.Publication;

public interface PublicationManager {

	void addPublication(Publication publication);

	Publication getPublication(Publication publication);

	void deletePublicationPicture(Publication publication);
        
                   List<Publication> getAllPublication();

	void updatePublication(Publication publication);

	void deletePublication(Publication publication);

}
