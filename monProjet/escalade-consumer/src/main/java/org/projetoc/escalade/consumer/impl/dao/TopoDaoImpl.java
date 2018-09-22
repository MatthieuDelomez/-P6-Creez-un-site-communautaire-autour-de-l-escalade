package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import org.projetoc.escalade.consumer.contract.dao.TopoDao;
import org.projetoc.escalade.model.Topo;
import org.projetoc.escalade.model.Utilisateur;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import RowMapper.TopoMapper;
import RowMapper.UtilisateurMapper;

public class TopoDaoImpl extends AbstractDaoImpl implements TopoDao {

	@Override
	public void addTopo(Topo topo) {

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		String sql = "INSERT INTO topo (ref, nom, descriptif, niveau_du_topo, type_de_topo, nom_du_site) VALUES (?,?,?,?,?,?)";

		Object[] args = new Object[] { topo.getRef(), topo.getNom(), topo.getDescriptif(), topo.getNiveau_du_topo(), topo.getType_de_topo(), topo.getNom_du_site() };

		try {
			jdbcTemplate.update(sql, args);
		} catch (DuplicateKeyException exception) {
			System.out.println(exception.getMessage());
		}

		

	}

	@Override
	public Topo getTopo(Topo topo) {

		String sql = "SELECT * FROM topo WHERE niveau_du_topo = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] args = new Object[] { topo.getNiveau_du_topo() };

		try {
			RowMapper<Topo> rowMapper = new TopoMapper();
			Topo topoQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);
			return topoQuery;

		} catch (EmptyResultDataAccessException exception) {
			System.out.println("Incorrect");
			return null;
		}

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
