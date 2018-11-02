package com.escalde.business.manager;

import org.projetoc.escalade.model.Secteur;

/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ un Secteur
*/

public interface SecteurManager {
    
                   /* Creation des methodes qui seront implementées dans SecteurManagerImpl */

	void addSecteur(Secteur secteur);

	Secteur getSecteur(Secteur secteur);

                   void deleteSecteurPicture(Secteur secteur);

                   void updateSecteur(Secteur secteur);

                   void deleteSecteur(Secteur secteur);

}
