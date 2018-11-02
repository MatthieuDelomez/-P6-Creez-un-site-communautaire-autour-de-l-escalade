package com.escalde.business.manager;

import org.projetoc.escalade.model.Commentaire;

/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ un commentaire
*/

public interface CommentaireManager {
    
                   /* Creation des methodes qui seront implementées dans CommentaireManagerImpl*/

	void addCommentaire(Commentaire commentaire);

	Commentaire getCommentaire(Commentaire commentaire);

	void deleteCommentairePicture(Commentaire commentaire);

	void updateCommentaire(Commentaire commentaire);

	void deleteCommentaire(Commentaire commentaire);
}
