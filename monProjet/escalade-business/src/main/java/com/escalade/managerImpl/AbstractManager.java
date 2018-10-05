package com.escalade.managerImpl;

import org.projetoc.escalade.consumer.impl.dao.DaoFactoryImpl;

public abstract class AbstractManager  {
	
	private DaoFactoryImpl daoFactory ;

	public DaoFactoryImpl getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(DaoFactoryImpl daoFactory) {
		this.daoFactory = daoFactory;
	}

}
