package org.projetoc.escalade.consumer.impl.dao;

import org.projetoc.escalade.consumer.contract.dao.VoiesDao;
import org.projetoc.escalade.model.Voies;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import RowMapper.VoiesMapper;

/*
Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
*/

public class VoiesDaoImpl extends AbstractDaoImpl implements VoiesDao {

                    /* Méthode pour ajouter une voies*/
                   /*Classe hérité de la classe Parente AbstractDaoImpl*/
	@Override
	public void addVoies(Voies voies) {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
                
                                      /* Nom des colonnes se situant dans table de la base de données*/
		String sql = "INSERT INTO voies ( nom_voies, nom_secteur, nom_du_site) VALUES (?,?,?);";

		Object[] args = new Object[] { voies.getNom_voies(), voies.getNom_secteur(), voies.getNom_du_site() };

		try {
			jdbcTemplate.update(sql, args);
		} catch (DuplicateKeyException exception) {
			System.out.println(exception.getMessage());
		}


	}

                   /* Méthode pour récupérer une voies*/
                   /*Classe hérité de la classe Parente AbstractDaoImpl*/
	@Override
	public Voies getVoies(Voies voies) {
		String sql = "SELECT * FROM voies WHERE nom_voies = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate();

		Object[] args = new Object[] { voies.getNom_voies() };

		try {
			RowMapper<Voies> rowMapper = new VoiesMapper();
                                                         /* Appel de la méthode QueryForObject*/
			Voies voiesQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);
			return voiesQuery;

		} catch (EmptyResultDataAccessException exception) {
			System.out.println("Incorrect");
			return null;
		}
	}

	@Override
	public void deleteVoiesPicture(Voies voies) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateVoies(Voies voies) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteVoies(Voies voies) {
		// TODO Auto-generated method stub

	}

}
