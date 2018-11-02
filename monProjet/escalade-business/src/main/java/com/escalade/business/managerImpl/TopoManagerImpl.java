package com.escalade.business.managerImpl;

import org.projetoc.escalade.model.Topo;

import com.escalde.business.manager.TopoManager;

import java.util.List;

/*
Creation de la classe TopoManagerImpl qui implemente l'interface TopoManager
*/

public class TopoManagerImpl extends AbstractManager implements TopoManager {
    
    /*
    Implementation des methodes
    */

    public void addTopo(Topo topo) {
        getDaoFactory().getTopoDao().addTopo(topo);
    }
    

    public Topo getTopo(Topo topo) {
        return getDaoFactory().getTopoDao().getTopo(topo);
    }


    public void deleteTopoPicture(Topo topo) {
        
        getDaoFactory().getTopoDao().deleteTopoPicture(topo);
    }

    public void updateTopo(Topo topo) {
        
        getDaoFactory().getTopoDao().updateTopo(topo);
    }

    public void deleteTopo(Topo topo) {
        getDaoFactory().getTopoDao().deleteTopo(topo);
    }
    
       /* Implementation de la methode liste des Topos /*/

    
        public List<Topo> getAllTopo() {
        
        System.out.println("---->>> manager getAllTopo");
        return getDaoFactory().getTopoDao().getAllTopo();
    }

	
}
