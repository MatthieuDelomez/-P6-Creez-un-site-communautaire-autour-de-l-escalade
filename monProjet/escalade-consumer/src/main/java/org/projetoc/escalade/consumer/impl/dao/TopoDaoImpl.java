package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import org.projetoc.escalade.consumer.contract.dao.TopoDao;
import org.projetoc.escalade.model.Topo;
import org.projetoc.escalade.model.Utilisateur;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import RowMapper.TopoMapper;
import RowMapper.UtilisateurMapper;

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
        args.addValue("topo_disponible", topo.isDisponible(), Types.BOOLEAN);
        args.addValue("topo_nom_du_site", topo.getNom_du_site(), Types.VARCHAR);
        
        try {
            getNamedParameterJdbcTemplate().update(sql, args);
        } catch (DuplicateKeyException exception) {
            System.out.println(exception.getMessage());
        }
		
	}

	@Override
	public Topo getTopo(Topo topo) {

		String sql = "SELECT * FROM topo WHERE niveau_du_topo = :topo_niveau_du_topo AND nom= :topo_nom;";
		
		MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("topo_niveau_du_topo", topo.getNiveau_du_topo(), Types.VARCHAR);
        args.addValue("nom", "diable", Types.VARCHAR);
        
        try {
            RowMapper<Topo> rowMapper = new TopoMapper();
            Topo userQuery = getNamedParameterJdbcTemplate().queryForObject(sql, args, rowMapper);
            

        } catch (EmptyResultDataAccessException exception) {
            System.out.println("Incorrect");
            return null;
        }
		
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
