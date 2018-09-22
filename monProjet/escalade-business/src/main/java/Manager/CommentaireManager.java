package Manager;

import org.projetoc.escalade.model.Commentaire;

public interface CommentaireManager {

	void addCommentaire(Commentaire commentaire);

	Commentaire getCommentaire(Commentaire commentaire);

	void deleteCommentairePicture(Commentaire commentaire);

	void updateCommentaire(Commentaire commentaire);

	void deleteCommentaire(Commentaire commentaire);
}
