package com.escalade.business.managerImpl;

import com.escalde.business.manager.EspacePretManager;
import org.projetoc.escalade.model.EspacePret;

/*
Creation d'une classe EspacePretManagerImpl qui implemente les methodes definis dans l'interface EspacePretManager
*/

public class EspacePretManagerImpl extends AbstractManager implements EspacePretManager {
    
                   /*
                   Implementation des methodes Ajouter  | Recuperer | Supprimer | MAJ  un espace de pret
                  */

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
