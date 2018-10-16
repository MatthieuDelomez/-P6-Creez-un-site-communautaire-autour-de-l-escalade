package com.escalade.business.managerImpl;

import org.projetoc.escalade.model.Topo;

import com.escalde.business.manager.TopoManager;

import java.util.List;

public class TopoManagerImpl extends AbstractManager implements TopoManager {

    public void addTopo(Topo topo) {
        getDaoFactory().getTopoDao().addTopo(topo);
    }
    

    public Topo getTopo(Topo topo) {
        return getDaoFactory().getTopoDao().getTopo(topo);
    }

    public List<Topo> getAllTopo() {
        
        System.out.println("---->>> manager getAllTopo");
        return getDaoFactory().getTopoDao().getAllTopo();
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

	
}
