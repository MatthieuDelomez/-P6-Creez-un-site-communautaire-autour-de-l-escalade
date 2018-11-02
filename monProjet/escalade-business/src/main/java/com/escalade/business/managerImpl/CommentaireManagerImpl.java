package com.escalade.business.managerImpl;

import org.projetoc.escalade.model.Commentaire;

import com.escalde.business.manager.CommentaireManager;

/*
Creation d'une classe CommentaireManagerImpl qui implemente les methodes definis dans l'interface CommentaireManager
*/

public class CommentaireManagerImpl extends AbstractManager implements CommentaireManager{
    
                   /*
                   Implementation des methodes Ajouter  | Recuperer | Supprimer | MAJ  un commentaire
                  */

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
