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


	@Override
	public void addCommentaire(Commentaire commentaire) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		String sql = "INSERT INTO commentaire (id, pseudo, publicationId,  createdAt) VALUES (?, ?, ?, ?)";

		Object[] args = new Object[] { commentaire.getId(),commentaire.getPseudo(), commentaire.getPublicationId(), commentaire.getCreatedAt() };

		try {
			jdbcTemplate.update(sql, args);
		} catch (DuplicateKeyException exception) {
			System.out.println(exception.getMessage());
		}


	}

	@Override
	public Commentaire getCommentaire(Commentaire commentaire) {

		String sql = "SELECT * FROM commentaire WHERE pseudo = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

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
