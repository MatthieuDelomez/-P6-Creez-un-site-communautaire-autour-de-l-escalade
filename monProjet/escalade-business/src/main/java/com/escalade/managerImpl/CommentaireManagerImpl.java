package com.escalade.managerImpl;

import org.projetoc.escalade.model.Commentaire;

import com.escalde.manager.CommentaireManager;

public class CommentaireManagerImpl extends AbstractManager implements CommentaireManager{

	@Override
	public void addCommentaire(Commentaire commentaire) {
		getDaoFactory().getCommentaireDao().addCommentaire(commentaire);
		
	}

	@Override
	public Commentaire getCommentaire(Commentaire commentaire) {
		return getDaoFactory().getCommentaireDao().getCommentaire(commentaire);
	}

	@Override
	public void deleteCommentairePicture(Commentaire commentaire) {
		getDaoFactory().getCommentaireDao().deleteCommentairePicture(commentaire);
		
	}

	@Override
	public void updateCommentaire(Commentaire commentaire) {
		getDaoFactory().getCommentaireDao().updateCommentaire(commentaire);
		
	}

	@Override
	public void deleteCommentaire(Commentaire commentaire) {
		getDaoFactory().getCommentaireDao().deleteCommentaire(commentaire);
		
	}

}
