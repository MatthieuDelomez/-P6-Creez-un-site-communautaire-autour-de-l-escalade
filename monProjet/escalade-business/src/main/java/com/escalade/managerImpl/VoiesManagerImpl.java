package com.escalade.managerImpl;

import org.projetoc.escalade.model.Voies;

import com.escalde.manager.VoiesManager;

public class VoiesManagerImpl extends AbstractManager implements VoiesManager {

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
