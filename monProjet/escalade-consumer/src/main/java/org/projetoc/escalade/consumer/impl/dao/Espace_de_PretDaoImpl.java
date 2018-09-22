package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import org.projetoc.escalade.consumer.contract.dao.Espace_de_PretDao;
import org.projetoc.escalade.model.Commentaire;
import org.projetoc.escalade.model.Espace_de_Pret;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import RowMapper.CommentaireMapper;
import RowMapper.EspacePretMapper;

public class Espace_de_PretDaoImpl extends AbstractDaoImpl implements Espace_de_PretDao {

	@Override
	public void addEspace_de_Pret(Espace_de_Pret pret) {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO espace_de_pret (id_pret , date_de_location, pseudo_proprio, disponible, topo_ref) VALUES (?,?,?,?,?);";
		
	Object[] args = new Object[] {pret.getId_pret() ,pret.getDate_de_location(),pret.getPseudo_proprio(), pret.isDisponible(), pret.getRef()};
		
        
        try {
            jdbcTemplate.update(sql, args);
        } catch (DuplicateKeyException exception) {
            System.out.println(exception.getMessage());
        }



	}

	/* SELECT */
	@Override
	public Espace_de_Pret getEspace_de_Pret(Espace_de_Pret pret) {
		String sql = "SELECT * FROM espace_de_pret WHERE disponible = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		Object[] args = new Object[] { pret.isDisponible() };

		try {
			RowMapper<Espace_de_Pret> rowMapper = new EspacePretMapper();
			Espace_de_Pret pretQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);
			return pretQuery;

		} catch (EmptyResultDataAccessException exception) {
			System.out.println("Incorrect");
			return null;
		}
	}

	@Override
	public void deleteEspace_de_PretPicture(Espace_de_Pret pret) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEspace_de_Pret(Espace_de_Pret pret) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEspace_de_Pret(Espace_de_Pret pret) {
		// TODO Auto-generated method stub

	}

}
