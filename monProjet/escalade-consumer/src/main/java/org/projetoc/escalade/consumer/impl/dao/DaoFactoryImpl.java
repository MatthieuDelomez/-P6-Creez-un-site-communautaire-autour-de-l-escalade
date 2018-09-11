package org.projetoc.escalade.consumer.impl.dao;

import org.projetoc.escalade.consumer.contract.dao.DaoFactory;
import org.projetoc.escalade.consumer.contract.dao.UtilisateurDao;

public class DaoFactoryImpl implements DaoFactory{
	

	@Override
	public UtilisateurDao getUtilisateuDao() {

		UtilisateurDao utilisateurDao = null ; 
		return utilisateurDao;
	}

}
