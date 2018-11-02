package com.escalde.business.manager;

import java.util.List;
import org.projetoc.escalade.model.Publication;

/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ une publication
*/

public interface PublicationManager {
    
                   /* Creation des methodes qui seront implementées dans PublicationManagerImpl */

	void addPublication(Publication publication);

	Publication getPublication(Publication publication);

	void deletePublicationPicture(Publication publication);

	void updatePublication(Publication publication);

	void deletePublication(Publication publication);
        
                  /* Creation d'une liste de publication qui servira à afficher les differentes publications sur une page Jsp */
        
                   List<Publication> getAllPublication();

}
