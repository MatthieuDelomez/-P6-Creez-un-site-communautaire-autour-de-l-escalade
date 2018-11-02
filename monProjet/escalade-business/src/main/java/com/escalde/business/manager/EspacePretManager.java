package com.escalde.business.manager;

import org.projetoc.escalade.model.EspacePret;

/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ un espace de pret
*/

public interface EspacePretManager {
    
                   /* Creation des methodes qui seront implementées dans EspacePretManagerImpl */	
    
                   void addEspacePret(EspacePret pret);

                   EspacePret getEspacePret(EspacePret pret);

                   void deleteEspacePretPicture(EspacePret pret);

                   void updateEspacePret(EspacePret pret);

                   void deleteEspacePret(EspacePret pret);

}
