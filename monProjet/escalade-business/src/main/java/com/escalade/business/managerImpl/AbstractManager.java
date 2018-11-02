package com.escalade.business.managerImpl;

import org.projetoc.escalade.consumer.impl.dao.DaoFactoryImpl;

/* Creation de la classe abstraite AbstractManager*/

public abstract class AbstractManager {

	private static DaoFactoryImpl daoFactory;

	protected static DaoFactoryImpl getDaoFactory() {
                   System.out.println("----> getDaoFactory : "+daoFactory);
		return daoFactory;
	}

	public static void setDaoFactory(DaoFactoryImpl daoFactory) {
		AbstractManager.daoFactory = daoFactory;
	}
}
