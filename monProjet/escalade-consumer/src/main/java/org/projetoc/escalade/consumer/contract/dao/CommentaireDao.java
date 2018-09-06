package org.projetoc.escalade.consumer.contract.dao;

import org.projetoc.escalade.model.Commentaire;

public interface CommentaireDao {

	void addCommentaire(Commentaire commentaire);

	Commentaire getCommentaire(Commentaire commentaire);

	void deleteCommentairePicture(Commentaire commentaire);

	void updateCommentaire(Commentaire commentaire);

	void deleteCommentaire(Commentaire commentaire);

}
