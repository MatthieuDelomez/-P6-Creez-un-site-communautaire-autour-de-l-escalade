package org.projetoc.escalade.consumer.impl.dao;

import org.projetoc.escalade.consumer.contract.dao.SecteurDao;
import org.projetoc.escalade.model.Secteur;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import RowMapper.SecteurMapper;

public class SecteurDaoImpl extends AbstractDaoImpl implements SecteurDao {

	@Override
	public void addSecteur(Secteur secteur) {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();

		String sql = "INSERT INTO secteur (nom_secteur, nom_du_site) VALUES (?,?)";

		Object[] args = new Object[] { secteur.getNom_secteur(), secteur.getNom_du_site()};

		try {
			jdbcTemplate.update(sql, args);
		} catch (DuplicateKeyException exception) {
			System.out.println(exception.getMessage());
		}

		
	}

	@Override
	public Secteur getSecteur(Secteur secteur) {
		String sql = "SELECT * FROM secteur WHERE nom_secteur = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate();

		Object[] args = new Object[] { secteur.getNom_secteur() };

		try {
			RowMapper<Secteur> rowMapper = new SecteurMapper();
			Secteur secteurQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);
			return secteurQuery;

		} catch (EmptyResultDataAccessException exception) {
			System.out.println("Incorrect");
			return null;
		}
	}

	@Override
	public void deleteSecteurPicture(Secteur secteur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateSecteur(Secteur secteur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteSecteur(Secteur secteur) {
		// TODO Auto-generated method stub

	}

}
