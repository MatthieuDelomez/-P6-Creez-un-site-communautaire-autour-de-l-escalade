package org.projetoc.escalade.consumer.contract.dao;

import java.util.List;

import org.projetoc.escalade.model.Publication;

/*
Creation du pattern Dao (Data Access Objet) pour communiquer avec la base de données via l'interface PublicationDao
*/

public interface PublicationDao {
    
                   /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/

	void addPublication(Publication publication);

	Publication getPublication(Publication publication);

	void deletePublicationPicture(Publication publication);
        
                   List<Publication> getAllPublication();

	void updatePublication(Publication publication);

	void deletePublication(Publication publication);

}
