package org.projetoc.escalade.consumer.contract.dao;

import org.projetoc.escalade.model.Voies;

/*
Creation du pattern Dao (Data Access Objet) pour communiquer avec la base de données via l'interface VoiesDao
*/

public interface VoiesDao {
    
                    /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/
	
	void addVoies(Voies voies);

	Voies getVoies(Voies voies);

                   void deleteVoiesPicture(Voies voies);

                   void updateVoies(Voies voies);

                   void deleteVoies(Voies voies);

}
