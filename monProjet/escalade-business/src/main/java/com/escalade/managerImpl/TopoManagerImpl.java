package com.escalade.managerImpl;

import org.projetoc.escalade.model.Topo;

import com.escalde.manager.TopoManager;
import java.util.List;

public class TopoManagerImpl extends AbstractManager implements TopoManager {

	@Override
	public void addTopo(Topo topo) {
		getDaoFactory().getTopoDao().addTopo(topo);
		
	}

	@Override
	public Topo getTopo(Topo topo) {
		return getDaoFactory().getTopoDao().getTopo(topo);

	}

	@Override
	public void deleteTopoPicture(Topo topo) {
		getDaoFactory().getTopoDao().deleteTopoPicture(topo);
		
	}

	@Override
	public void updateTopo(Topo topo) {
		getDaoFactory().getTopoDao().updateTopo(topo);
		
	}

	@Override
	public void deleteTopo(Topo topo) {
		getDaoFactory().getTopoDao().deleteTopo(topo);
		
	}

    public List<Topo> getAllTopo() {
        
           return getDaoFactory().getTopoDao().getAllTopo();
        
        
    }

}
