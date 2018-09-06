package org.projetoc.escalade.consumer.contract.dao;

import org.projetoc.escalade.model.Voies;

public interface VoiesDao {
	
	void addVoies(Voies voies);

	Voies getVoies(Voies voies);

    void deleteVoiesPicture(Voies voies);

    void updateVoies(Voies voies);

    void deleteVoies(Voies voies);

}
