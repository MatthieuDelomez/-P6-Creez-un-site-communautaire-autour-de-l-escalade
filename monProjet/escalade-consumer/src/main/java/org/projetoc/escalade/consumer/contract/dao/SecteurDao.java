package org.projetoc.escalade.consumer.contract.dao;

import org.projetoc.escalade.model.Secteur;

/*
Creation du pattern Dao (Data Access Objet) pour communiquer avec la base de données via l'interface SecteurDao
*/

public interface SecteurDao {
    
                   /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/
	
	void addSecteur(Secteur secteur);

	Secteur getSecteur(Secteur secteur);

                   void deleteSecteurPicture(Secteur secteur);

                   void updateSecteur(Secteur secteur);

                   void deleteSecteur(Secteur secteur);

}
