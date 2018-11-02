package com.escalade.business.managerImpl;

import org.projetoc.escalade.model.Utilisateur;

import com.escalde.business.manager.UtilisateurManager;

/*
Creation de la classe UtilisateurManagerImpl qui implemente l'interface UtilisateurManager
*/

public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager {
    
                   /*
                   Implementation des methodes
                   */

	@Override
	public void addUser(Utilisateur user) {
 
		getDaoFactory().getUtilisateurDao().addUser(user);
		
	}

	@Override
	public Utilisateur getUser(Utilisateur user) {
	return	getDaoFactory().getUtilisateurDao().getUser(user);
		
		
	}

	@Override
	public void deleteUserPicture(Utilisateur user) {
		getDaoFactory().getUtilisateurDao().deleteUserPicture(user);
		
	}

	@Override
	public void updateUser(Utilisateur user) {
		getDaoFactory().getUtilisateurDao().updateUser(user);
		
	}

	@Override
	public void deleteUser(Utilisateur user) {
		getDaoFactory().getUtilisateurDao().deleteUser(user);
		
	}
	
	

}
