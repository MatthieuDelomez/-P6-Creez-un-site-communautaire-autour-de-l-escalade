package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import org.projetoc.escalade.consumer.contract.dao.SecteurDao;
import org.projetoc.escalade.model.Espace_de_Pret;
import org.projetoc.escalade.model.Secteur;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import RowMapper.EspacePretMapper;
import RowMapper.SecteurMapper;

public class SecteurDaoImpl extends AbstractDaoImpl implements SecteurDao{

	@Override
	public void addSecteur(Secteur secteur) {
		String sql = "INSERT INTO secteur (nom_secteur, nom_du_site) VALUES (?,?)";
		
		MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("secteur_nom_secteur", secteur.getNom_secteur(), Types.VARCHAR);
        args.addValue("secteur_nom_du_site", secteur.getNom_du_site(), Types.VARCHAR);
        
        try {
            getNamedParameterJdbcTemplate().update(sql, args);
        } catch (DuplicateKeyException exception) {
            System.out.println(exception.getMessage());
        }
       }

	@Override
	public Secteur getSecteur(Secteur secteur) {
		String sql = "SELECT * FROM secteur WHERE nom_secteur = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

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
