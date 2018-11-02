package org.projetoc.escalade.consumer.impl.dao;

import org.projetoc.escalade.consumer.contract.dao.SitesDao;
import org.projetoc.escalade.model.Sites;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import RowMapper.SitesMapper;

/*
Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
*/

public class SitesDaoImpl extends AbstractDaoImpl implements SitesDao {
    
                    /* Méthode pour ajouter un site*/

	@Override /*Classe hérité de la classe Parente AbstractDaoImpl*/
	public void addSites(Sites sites) {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
                                      /* Nom des colonnes se situant dans table de la base de données*/
		String sql = "INSERT INTO sites (nom_du_site, nombre_de_secteur) VALUES (?, ?);";

		Object[] args = new Object[] { sites.getNom_du_site(), sites.getNombre_de_secteur()};

		try {
			jdbcTemplate.update(sql, args);
		} catch (DuplicateKeyException exception) {
			System.out.println(exception.getMessage());
		}

	
	}

                   
                   /* Méthode pour récupérer un site*/
        
	@Override /*Classe hérité de la classe Parente AbstractDaoImpl*/
	public Sites getSites(Sites sites) {
            
		String sql = "SELECT * FROM sites WHERE nom_du_site = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate();

		Object[] args = new Object[] { sites.getNom_du_site() };

		try {
			RowMapper<Sites> rowMapper = new SitesMapper();
                                                          /* Appel à la méthode QueryForObject*/
			Sites sitesQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);
			return sitesQuery;

		} catch (EmptyResultDataAccessException exception) {
			System.out.println("Incorrect");
			return null;
		}
	}

	@Override
	public void deleteSitesPicture(Sites sites) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateSites(Sites sites) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteSites(Sites sites) {
		// TODO Auto-generated method stub

	}

}
