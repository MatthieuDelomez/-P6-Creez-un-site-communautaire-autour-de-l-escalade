package org.projetoc.escalade.consumer.contract.dao;

import org.projetoc.escalade.model.EspacePret;

/*
Creation du pattern Dao (Data Access Objet) pour communiquer avec la base de données via l'interface EspacePretDao
*/

public interface EspacePretDao {
    
                   /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/
	
	void addEspacePret(EspacePret pret);

	EspacePret getEspacePret(EspacePret pret);

                   void deleteEspacePretPicture(EspacePret pret);

                   void updateEspacePret(EspacePret pret);

                   void deleteEspacePret(EspacePret pret);

}
