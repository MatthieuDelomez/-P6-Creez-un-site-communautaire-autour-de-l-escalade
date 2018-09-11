package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import org.projetoc.escalade.consumer.contract.dao.CommentaireDao;
import org.projetoc.escalade.model.Commentaire;
import org.projetoc.escalade.model.Utilisateur;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import RowMapper.CommentaireMapper;
import RowMapper.UtilisateurMapper;

public class CommentaireDaoImpl extends AbstractDaoImpl implements CommentaireDao {

	@Override
	public void addCommentaire(Commentaire commentaire) {
		String sql = "INSERT INTO commentaire (id, userAccountId, publicationId, parentId, createdAt, updateAt, content) VALUES (:commentaire_id ,:commentaire_userAccountId , :commentaire_publicationId, :commentaire_parentId, :commentaire_createdAt, :commentaire_updateAt, :commentaire_content  );";

		MapSqlParameterSource args = new MapSqlParameterSource();
		args.addValue("commentaire_id", commentaire.getId(), Types.INTEGER);
		args.addValue("commentaire_userAccountId", commentaire.getUserAccountId(), Types.INTEGER);
		args.addValue("commentaire_publicationId", commentaire.getPublicationId(), Types.INTEGER);
		args.addValue("commentaire_parentId", commentaire.getParentId(), Types.INTEGER);
		args.addValue("commentaire_createdAt", commentaire.getCreatedAt(), Types.DATE);
		args.addValue("commentaire_updateAt", commentaire.getUpdateAt(), Types.DATE);
		args.addValue("commentaire_content", commentaire.getContent(), Types.VARCHAR);
		
		try {
            getNamedParameterJdbcTemplate().update(sql, args);
        } catch (DuplicateKeyException exception) {
            System.out.println(exception.getMessage());
        }
		



	}

	@Override
	public Commentaire getCommentaire(Commentaire commentaire) {

		String sql = "SELECT * FROM commentaire WHERE createdAt = :commentaire_createdAt;";
		
		MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("commentaire_createdAt", commentaire.getCreatedAt(), Types.DATE);

        
        try {
            RowMapper<Commentaire> rowMapper = new CommentaireMapper();
            Commentaire userQuery = getNamedParameterJdbcTemplate().queryForObject(sql, args, rowMapper);
            

        } catch (EmptyResultDataAccessException exception) {
            System.out.println("Incorrect");
            return null;
        }
		
		return null;
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
