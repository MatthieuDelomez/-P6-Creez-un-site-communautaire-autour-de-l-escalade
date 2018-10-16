package com.escalde.business.manager;

import org.projetoc.escalade.model.EspacePret;

public interface EspacePretManager {
	
	void addEspacePret(EspacePret pret);

	EspacePret getEspacePret(EspacePret pret);

    void deleteEspacePretPicture(EspacePret pret);

    void updateEspacePret(EspacePret pret);

    void deleteEspacePret(EspacePret pret);

}
