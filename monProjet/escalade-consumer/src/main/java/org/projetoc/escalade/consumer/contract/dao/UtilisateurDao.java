package org.projetoc.escalade.consumer.contract.dao;

import org.projetoc.escalade.model.Utilisateur;


public interface UtilisateurDao {
	
	    void addUser(Utilisateur user);

	    Utilisateur getUser(Utilisateur user);

	    void deleteUserPicture(Utilisateur user);

	    void updateUser(Utilisateur user);

	    void deleteUser(Utilisateur user);
	}


