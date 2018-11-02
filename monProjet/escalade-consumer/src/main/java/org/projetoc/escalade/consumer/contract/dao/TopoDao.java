package org.projetoc.escalade.consumer.contract.dao;

import java.util.List;

import org.projetoc.escalade.model.Topo;

/*
Creation du pattern Dao (Data Access Objet) pour communiquer avec la base de données via l'interface TopoDao
*/

public interface TopoDao {
    
                   /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/

                    void addTopo(Topo topo);

                    Topo getTopo(Topo topo);

                    void deleteTopoPicture(Topo topo);

                    void updateTopo(Topo topo);

                    void deleteTopo(Topo topo);
                    
                    /* Creation de la liste des Topos qui permettra de l'afficher dans une page jsp*/

                   List<Topo> getAllTopo();

}
