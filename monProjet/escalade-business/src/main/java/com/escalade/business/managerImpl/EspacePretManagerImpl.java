package com.escalade.business.managerImpl;

import com.escalde.business.manager.EspacePretManager;
import org.projetoc.escalade.model.EspacePret;

public class EspacePretManagerImpl extends AbstractManager implements EspacePretManager {

	public void addEspacePret(EspacePret pret) {
		getDaoFactory().getEspacePretDao().addEspacePret(pret);
		
	}

	public EspacePret getEspacePret(EspacePret pret) {
		return getDaoFactory().getEspacePretDao().getEspacePret(pret);

	}


	public void deleteEspacePretPicture(EspacePret pret) {
		getDaoFactory().getEspacePretDao().deleteEspacePretPicture(pret);
		
	}

	public void updateEspacePret(EspacePret pret) {
		getDaoFactory().getEspacePretDao().updateEspacePret(pret);
		
	}

	public void deleteEspacePret(EspacePret pret) {
		getDaoFactory().getEspacePretDao().deleteEspacePret(pret);
		
	}

}
