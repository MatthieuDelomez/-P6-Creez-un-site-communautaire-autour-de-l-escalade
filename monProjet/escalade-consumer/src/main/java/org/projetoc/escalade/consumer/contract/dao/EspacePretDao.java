package org.projetoc.escalade.consumer.contract.dao;

import org.projetoc.escalade.model.EspacePret;

public interface EspacePretDao {
	
	void addEspacePret(EspacePret pret);

	EspacePret getEspacePret(EspacePret pret);

    void deleteEspacePretPicture(EspacePret pret);

    void updateEspacePret(EspacePret pret);

    void deleteEspacePret(EspacePret pret);

}
