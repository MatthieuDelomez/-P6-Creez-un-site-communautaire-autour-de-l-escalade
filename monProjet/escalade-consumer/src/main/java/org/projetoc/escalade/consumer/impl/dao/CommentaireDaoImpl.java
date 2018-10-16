package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import javax.sql.DataSource;

import org.projetoc.escalade.consumer.contract.dao.CommentaireDao;
import org.projetoc.escalade.model.Commentaire;
import org.projetoc.escalade.model.Utilisateur;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import RowMapper.CommentaireMapper;
import RowMapper.UtilisateurMapper;

public class CommentaireDaoImpl extends AbstractDaoImpl implements CommentaireDao {

	private static java.sql.Date convert(java.util.Date uDate) {
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		return sDate;
	}



	public void addCommentaire(Commentaire commentaire) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();

		String sql = "INSERT INTO commentaire (id, titre, pseudo, publicationId,  createdAt) VALUES (?, ?, ?, ?, ?)";

		Object[] args = new Object[] { commentaire.getId(), commentaire.getTitre(),commentaire.getPseudo(), commentaire.getPublicationId(), commentaire.getCreatedAt() };

		try {
			jdbcTemplate.update(sql, args);
		} catch (DuplicateKeyException exception) {
			System.out.println(exception.getMessage());
		}


	}

	public Commentaire getCommentaire(Commentaire commentaire) {

		String sql = "SELECT * FROM commentaire WHERE pseudo = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate();

		Object[] args = new Object[] { commentaire.getPseudo() };

		try {
			RowMapper<Commentaire> rowMapper = new CommentaireMapper();
			Commentaire comQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);
			return comQuery;

		} catch (EmptyResultDataAccessException exception) {
			System.out.println("Incorrect");
			return null;
		}

	}

	public void deleteCommentairePicture(Commentaire commentaire) {
		// TODO Auto-generated method stub

	}

	public void updateCommentaire(Commentaire commentaire) {
		// TODO Auto-generated method stub

	}

	public void deleteCommentaire(Commentaire commentaire) {
		// TODO Auto-generated method stub

	}

}
