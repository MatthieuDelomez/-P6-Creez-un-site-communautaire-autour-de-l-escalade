package com.escalade.managerImpl;

import org.projetoc.escalade.model.Utilisateur;


import com.escalde.manager.UtilisateurManager;

public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager {

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
