package com.escalade.managerImpl;

import org.projetoc.escalade.model.Espace_de_Pret;

import com.escalde.manager.Espace_de_PretManager;

public class Espace_de_PretManagerImpl extends AbstractManager implements Espace_de_PretManager {

	@Override
	public void addEspace_de_Pret(Espace_de_Pret pret) {
		getDaoFactory().getEspace_de_PretDao().addEspace_de_Pret(pret);
		
	}

	@Override
	public Espace_de_Pret getEspace_de_Pret(Espace_de_Pret pret) {
		return getDaoFactory().getEspace_de_PretDao().getEspace_de_Pret(pret);

	}

	@Override
	public void deleteEspace_de_PretPicture(Espace_de_Pret pret) {
		getDaoFactory().getEspace_de_PretDao().deleteEspace_de_PretPicture(pret);
		
	}

	@Override
	public void updateEspace_de_Pret(Espace_de_Pret pret) {
		getDaoFactory().getEspace_de_PretDao().updateEspace_de_Pret(pret);
		
	}

	@Override
	public void deleteEspace_de_Pret(Espace_de_Pret pret) {
		getDaoFactory().getEspace_de_PretDao().deleteEspace_de_Pret(pret);
		
	}

}
