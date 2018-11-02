package org.projetoc.escalade.consumer.impl.dao;

import org.projetoc.escalade.consumer.contract.dao.PublicationDao;
import org.projetoc.escalade.model.Publication;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import RowMapper.PublicationMapper;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

/*
Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
*/

public class PublicationDaoImpl extends AbstractDaoImpl implements PublicationDao {
    
                  /* Méthode pour ajouter une publication */

                  @Override /*Classe hérité de la classe Parente AbstractDaoImpl*/
	public void addPublication(Publication publication) {
		
		JdbcTemplate jdbcTemplate = getJdbcTemplate();
                                      /* Nom des colonnes se situant dans table de la base de données*/
		String sql = "INSERT INTO publication (titre, description, date_maj, pseudo) VALUES (?,?,?,?)";
	
	                   Object[] args = new Object[] {publication.getTitre(),publication.getDescription(),publication.getDate_maj(), publication.getPseudo()};
		
        
                                                try {
                                                       jdbcTemplate.update(sql, args);
                                       } catch (DuplicateKeyException exception) {
                                                      System.out.println(exception.getMessage());
   
                              }

                              }

                    /* Méthode pour récupérer une publication*/

                   @Override/*Classe hérité de la classe Parente AbstractDaoImpl*/
	public Publication getPublication(Publication publication) {
		String sql = "SELECT * FROM publication WHERE date_maj = ?";

		JdbcTemplate jdbcTemplate = getJdbcTemplate();
		
		Object[] args = new Object[] {
				 publication.getDate_maj()
		};


		try {
			RowMapper<Publication> rowMapper = new PublicationMapper();
			Publication publicationQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);
    		return publicationQuery;

		} catch (EmptyResultDataAccessException exception) {
			System.out.println("Incorrect");
			return null;
		}

	}
        
                   /* Méthode pour récuperer une liste de publication dans la table Publication de la base de données */
        
                  @Override/*Classe hérité de la classe Parente AbstractDaoImpl*/
        	public List<Publication> getAllPublication() {
            
                                                         /* Log console*/
			System.out.println("Entree4Pub");

                                     String sql = "SELECT * FROM publication";

		JdbcTemplate jdbcTemplate = getJdbcTemplate();

		try {
			List<Publication> publicationQuery = jdbcTemplate.query(sql,
			new BeanPropertyRowMapper(Publication.class));
			return publicationQuery;

		} catch (EmptyResultDataAccessException exception) {
			System.out.println("Incorrect");
			return null;
		}
            

	}

                   @Override
	public void deletePublicationPicture(Publication publication) {
		// TODO Auto-generated method stub

	}
 
                   @Override
	public void updatePublication(Publication publication) {
		// TODO Auto-generated method stub

	}

                   @Override
	public void deletePublication(Publication publication) {
		// TODO Auto-generated method stub

	}

}
