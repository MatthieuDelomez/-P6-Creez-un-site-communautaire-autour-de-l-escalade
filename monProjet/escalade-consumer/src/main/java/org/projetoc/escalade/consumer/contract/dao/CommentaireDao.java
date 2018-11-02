package org.projetoc.escalade.consumer.contract.dao;

import org.projetoc.escalade.model.Commentaire;

/*
Creation du pattern Dao (Data Access Objet) pour communiquer avec la base de données via l'interface CommentaireDao
*/

public interface CommentaireDao {
    
                   /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/

	void addCommentaire(Commentaire commentaire);

	Commentaire getCommentaire(Commentaire commentaire);

	void deleteCommentairePicture(Commentaire commentaire);

	void updateCommentaire(Commentaire commentaire);

	void deleteCommentaire(Commentaire commentaire);

}
