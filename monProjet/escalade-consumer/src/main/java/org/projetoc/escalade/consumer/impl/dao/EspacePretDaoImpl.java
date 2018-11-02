package org.projetoc.escalade.consumer.impl.dao;

import org.projetoc.escalade.consumer.contract.dao.EspacePretDao;
import org.projetoc.escalade.model.EspacePret;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import RowMapper.EspacePretMapper;

/*
Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
*/

public class EspacePretDaoImpl extends AbstractDaoImpl implements EspacePretDao {

                   /* Méthode pour ajouter un espace de pret */

                  @Override /*Classe hérité de la classe Parente AbstractDaoImpl*/    
	public void addEspacePret(EspacePret pret) {
		
		JdbcTemplate jdbcTemplate = getJdbcTemplate();
                                      /* Nom des colonnes se situant dans table de la base de données*/
		String sql = "INSERT INTO espace_de_pret ( date_de_location, pseudo_proprio,  topo_ref) VALUES (?,?,?);";
		
                
	                   Object[] args = new Object[] {pret.getDate_de_location(),pret.getPseudo_proprio(),  pret.getRef()};
		
        
                                      try {
                                      jdbcTemplate.update(sql, args);
                                      } catch (DuplicateKeyException exception) {
                                      System.out.println(exception.getMessage());
                                      
                                      }



	}
        
                   /* Méthode pour récupérer un espace de pret */

                  @Override /*Classe hérité de la classe Parente AbstractDaoImpl*/
	public EspacePret getEspacePret(EspacePret pret) {
		String sql = "SELECT * FROM espace_de_pret WHERE disponible = ?";

		JdbcTemplate jdbcTemplate = getJdbcTemplate();

		Object[] args = new Object[] { };

		try {
			RowMapper<EspacePret> rowMapper = new EspacePretMapper();
                                                          /* Appel à la méthodes QueryForObject*/
			EspacePret pretQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);
			return pretQuery;

		} catch (EmptyResultDataAccessException exception) {
			System.out.println("Incorrect");
			return null;
		}
	}

                    @Override
	public void deleteEspacePretPicture(EspacePret pret) {

	}
                    @Override
	public void updateEspacePret(EspacePret pret) {

	}
                    @Override
	public void deleteEspacePret(EspacePret pret) {

	}


}
