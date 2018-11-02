package org.projetoc.escalade.consumer.impl.dao;

import org.projetoc.escalade.consumer.contract.dao.SecteurDao;
import org.projetoc.escalade.model.Secteur;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import RowMapper.SecteurMapper;

/*
Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
*/

public class SecteurDaoImpl extends AbstractDaoImpl implements SecteurDao {
    
                   /* Méthode pour ajouter un secteur */

	@Override /*Classe hérité de la classe Parente AbstractDaoImpl*/
	public void addSecteur(Secteur secteur) {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
                                      /* Nom des colonnes se situant dans table de la base de données*/
		String sql = "INSERT INTO secteur (nom_secteur, nom_du_site) VALUES (?,?)";

		Object[] args = new Object[] { secteur.getNom_secteur(), secteur.getNom_du_site()};

		try {
			jdbcTemplate.update(sql, args);
		} catch (DuplicateKeyException exception) {
			System.out.println(exception.getMessage());
		}

		
	}

                   /* Méthode pour récuperer un secteur */
        
	@Override /*Classe hérité de la classe Parente AbstractDaoImpl*/
	public Secteur getSecteur(Secteur secteur) {
            
		String sql = "SELECT * FROM secteur WHERE nom_secteur = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate();

		Object[] args = new Object[] { secteur.getNom_secteur() };

		try {
			RowMapper<Secteur> rowMapper = new SecteurMapper();
                                                          /* Appel à la méthode QueryForObject */
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
