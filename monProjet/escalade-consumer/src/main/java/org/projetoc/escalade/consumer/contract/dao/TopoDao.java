package org.projetoc.escalade.consumer.contract.dao;

import java.util.List;
import org.projetoc.escalade.model.Topo;

public interface TopoDao {

    void addTopo(Topo topo);

    Topo getTopo(Topo topo);

    List<Topo> getAllTopo();

    void deleteTopoPicture(Topo topo);

    void updateTopo(Topo topo);

    void deleteTopo(Topo topo);
}
