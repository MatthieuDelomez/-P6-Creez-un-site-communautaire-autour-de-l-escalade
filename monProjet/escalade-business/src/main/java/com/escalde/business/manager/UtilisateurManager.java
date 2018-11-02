package com.escalde.business.manager;

import org.projetoc.escalade.model.Utilisateur;

/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ un Utilisateur
*/

public interface UtilisateurManager {
    
                   /* Creation des methodes qui seront implementées dans UtilisateurManagerImpl */

	void addUser(Utilisateur user);

	Utilisateur getUser(Utilisateur user);

	void deleteUserPicture(Utilisateur user);

	void updateUser(Utilisateur user);

	void deleteUser(Utilisateur user);

}
