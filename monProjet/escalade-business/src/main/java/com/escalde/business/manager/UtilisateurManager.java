package com.escalde.business.manager;

import org.projetoc.escalade.model.Utilisateur;

public interface UtilisateurManager {

	void addUser(Utilisateur user);

	Utilisateur getUser(Utilisateur user);

	void deleteUserPicture(Utilisateur user);

	void updateUser(Utilisateur user);

	void deleteUser(Utilisateur user);

}
