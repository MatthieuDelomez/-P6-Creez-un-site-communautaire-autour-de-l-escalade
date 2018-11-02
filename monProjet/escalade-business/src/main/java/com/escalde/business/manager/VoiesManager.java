package com.escalde.business.manager;

import org.projetoc.escalade.model.Voies;

/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ une Voies
*/

public interface VoiesManager {
    
                   /* Creation des methodes qui seront implementées dans VoiesManagerImpl */
	
	void addVoies(Voies voies);

	Voies getVoies(Voies voies);

                   void deleteVoiesPicture(Voies voies);

                   void updateVoies(Voies voies);

                   void deleteVoies(Voies voies);

}
