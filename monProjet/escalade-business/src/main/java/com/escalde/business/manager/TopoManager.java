package com.escalde.business.manager;

import org.projetoc.escalade.model.Topo;

import java.util.List;

public interface TopoManager {

    void addTopo(Topo topo);

    Topo getTopo(Topo topo);

    List<Topo> getAllTopo();

    void deleteTopoPicture(Topo topo);

    void updateTopo(Topo topo);

    void deleteTopo(Topo topo);

}
