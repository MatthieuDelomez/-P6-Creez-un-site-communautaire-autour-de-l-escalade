package com.escalde.business.manager;

import org.projetoc.escalade.model.Voies;

public interface VoiesManager {
	
	void addVoies(Voies voies);

	Voies getVoies(Voies voies);

    void deleteVoiesPicture(Voies voies);

    void updateVoies(Voies voies);

    void deleteVoies(Voies voies);

}
