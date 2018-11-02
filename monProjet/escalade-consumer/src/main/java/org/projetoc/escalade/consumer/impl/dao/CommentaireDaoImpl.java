package org.projetoc.escalade.consumer.impl.dao;

import org.projetoc.escalade.consumer.contract.dao.CommentaireDao;
import org.projetoc.escalade.model.Commentaire;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import RowMapper.CommentaireMapper;

/*
Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
*/

public class CommentaireDaoImpl extends AbstractDaoImpl implements CommentaireDao {

    
	private static java.sql.Date convert(java.util.Date uDate) {
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		return sDate;
	}

                   /* Méthode pour ajouter un commentaire */
        
                  @Override /*Classe hérité de la classe Parente AbstractDaoImpl*/
	public void addCommentaire(Commentaire commentaire) {
            
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
                                      /* Nom des colonnes se situant dans table de la base de données*/
		String sql = "INSERT INTO commentaire (id, titre, pseudo, publicationId,  createdAt) VALUES (?, ?, ?, ?, ?)";

		Object[] args = new Object[] { commentaire.getId(), commentaire.getTitre(),commentaire.getPseudo(), commentaire.getPublicationId(), commentaire.getCreatedAt() };

		try {
			jdbcTemplate.update(sql, args);
		} catch (DuplicateKeyException exception) {
			System.out.println(exception.getMessage());
		}


	}
        
                   /* Méthode pour récupérer un commentaire */

                   @Override /*Classe hérité de la classe Parente AbstractDaoImpl*/
	public Commentaire getCommentaire(Commentaire commentaire) {

		String sql = "SELECT * FROM commentaire WHERE pseudo = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate();

		Object[] args = new Object[] { commentaire.getPseudo() };

		try {
			RowMapper<Commentaire> rowMapper = new CommentaireMapper();
                                                          /* Appel à la méthode QueryForObject*/
			Commentaire comQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);
			return comQuery;

		} catch (EmptyResultDataAccessException exception) {
			System.out.println("Incorrect");
			return null;
		}

	}
        
        

                    @Override
	public void deleteCommentairePicture(Commentaire commentaire) {
		// TODO Auto-generated method stub

	}
                    @Override
	public void updateCommentaire(Commentaire commentaire) {
		// TODO Auto-generated method stub

	}
                   @Override
	public void deleteCommentaire(Commentaire commentaire) {
		// TODO Auto-generated method stub

	}

}
