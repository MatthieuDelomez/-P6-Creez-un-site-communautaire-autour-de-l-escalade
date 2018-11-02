package com.escalade.business.managerImpl;

import org.projetoc.escalade.model.Voies;

import com.escalde.business.manager.VoiesManager;

/*
Creation de la classe VoiesManagerImpl qui implemente l'interface VoiesManager
*/

public class VoiesManagerImpl extends AbstractManager implements VoiesManager {
    
                   /*
                   Implementation des methodes
                   */

	@Override
	public void addVoies(Voies voies) {
		getDaoFactory().getVoiesDao().addVoies(voies);
		
	}

	@Override
	public Voies getVoies(Voies voies) {
		return getDaoFactory().getVoiesDao().getVoies(voies);

	}

	@Override
	public void deleteVoiesPicture(Voies voies) {
		getDaoFactory().getVoiesDao().deleteVoiesPicture(voies);
		
	}

	@Override
	public void updateVoies(Voies voies) {
		getDaoFactory().getVoiesDao().updateVoies(voies);
		
	}

	@Override
	public void deleteVoies(Voies voies) {
		getDaoFactory().getVoiesDao().deleteVoies(voies);
		
	}

}
