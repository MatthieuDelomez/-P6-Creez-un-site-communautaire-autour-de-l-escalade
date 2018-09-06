package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import org.projetoc.escalade.consumer.contract.dao.TopoDao;
import org.projetoc.escalade.model.Topo;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

public class TopoDaoImpl extends AbstractDaoImpl implements TopoDao{

	@Override
	public void addTopo(Topo topo) {
		String sql = "INSERT INTO topo (ref, nom, descriptif, niveau_du_topo, titre_de_publication, disponible, nom_du_site) VALUES (:topo_ref ,:topo_nom , :topo_descriptif, :topo_niveau_du_topo, topo_titre_de_publication, topo_disponible, topo_nom_du_site );";
		
		MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("topo_ref", topo.getRef(), Types.VARCHAR);
        args.addValue("topo_nom", topo.getNom(), Types.VARCHAR);
        args.addValue("topo_descriptif", topo.getDescriptif(), Types.VARCHAR);
        args.addValue("topo_niveau_du_topo", topo.getNiveau_du_topo(), Types.VARCHAR);
        args.addValue("topo_titre_de_publication", topo.getTitre_de_publication(), Types.VARCHAR);
        args.addValue("topo_niveau_du_topo", topo.isDisponible(), Types.BOOLEAN);
        args.addValue("topo_nom_du_site", topo.getNom_du_site(), Types.VARCHAR);
		
	}

	@Override
	public Topo getTopo(Topo topo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTopoPicture(Topo topo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTopo(Topo topo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTopo(Topo topo) {
		// TODO Auto-generated method stub
		
	}

}
