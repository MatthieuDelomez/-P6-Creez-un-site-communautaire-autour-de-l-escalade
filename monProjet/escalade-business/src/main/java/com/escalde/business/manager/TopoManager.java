package com.escalde.business.manager;

import org.projetoc.escalade.model.Topo;

import java.util.List;

/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ un Topo
*/

public interface TopoManager {
    
                       /* Creation des methodes qui seront implementées dans TopoManagerImpl */

                       void addTopo(Topo topo);

                       Topo getTopo(Topo topo);

                       void deleteTopoPicture(Topo topo);

                      void updateTopo(Topo topo);

                      void deleteTopo(Topo topo);
                      
                      /* Creation d'une liste de topo qui servira à afficher les differents topo sur une page Jsp */
    
                      List<Topo> getAllTopo();

}
