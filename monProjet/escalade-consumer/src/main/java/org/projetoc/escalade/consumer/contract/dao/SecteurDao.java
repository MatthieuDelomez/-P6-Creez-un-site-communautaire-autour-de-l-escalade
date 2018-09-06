package org.projetoc.escalade.consumer.contract.dao;

import org.projetoc.escalade.model.Secteur;

public interface SecteurDao {
	
	void addSecteur(Secteur secteur);

	Secteur getSecteur(Secteur secteur);

    void deleteSecteurPicture(Secteur secteur);

    void updateSecteur(Secteur secteur);

    void deleteSecteur(Secteur secteur);

}
