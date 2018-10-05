package com.escalde.manager;

import org.projetoc.escalade.model.Espace_de_Pret;

public interface Espace_de_PretManager {
	
	void addEspace_de_Pret(Espace_de_Pret pret);

	Espace_de_Pret getEspace_de_Pret(Espace_de_Pret pret);

    void deleteEspace_de_PretPicture(Espace_de_Pret pret);

    void updateEspace_de_Pret(Espace_de_Pret pret);

    void deleteEspace_de_Pret(Espace_de_Pret pret);

}
