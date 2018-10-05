package com.escalde.manager;

import org.projetoc.escalade.model.Secteur;

public interface SecteurManager {
	
	void addSecteur(Secteur secteur);

	Secteur getSecteur(Secteur secteur);

    void deleteSecteurPicture(Secteur secteur);

    void updateSecteur(Secteur secteur);

    void deleteSecteur(Secteur secteur);

}
