package com.escalade.resources;


import com.escalade.managerImpl.ManagerFactoryImpl;

public class AbstractResource {

	private static ManagerFactoryImpl managerFactory;

    protected static ManagerFactoryImpl getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactoryImpl managerFactory) {
        AbstractResource.managerFactory = managerFactory;
    }
	
}
