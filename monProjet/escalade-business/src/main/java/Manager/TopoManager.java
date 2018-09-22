package Manager;

import org.projetoc.escalade.model.Topo;

public interface TopoManager {
	
	void addTopo(Topo topo);

	Topo getTopo(Topo topo);

    void deleteTopoPicture(Topo topo);

    void updateTopo(Topo topo);

    void deleteTopo(Topo topo);

}
