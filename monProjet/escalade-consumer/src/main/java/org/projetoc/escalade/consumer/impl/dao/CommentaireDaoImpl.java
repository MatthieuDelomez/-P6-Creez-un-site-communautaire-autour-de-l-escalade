package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import org.projetoc.escalade.consumer.contract.dao.CommentaireDao;
import org.projetoc.escalade.model.Commentaire;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

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
		



	}

	@Override
	public Commentaire getCommentaire(Commentaire commentaire) {
		// TODO Auto-generated method stub
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
