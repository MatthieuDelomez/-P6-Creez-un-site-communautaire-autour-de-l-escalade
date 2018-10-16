package com.escalade.controllers;

import com.escalade.business.managerImpl.ManagerFactoryImpl;

public abstract class AbstractController {

    private static ManagerFactoryImpl managerFactory;

    protected static ManagerFactoryImpl getManagerFactory() {
        System.out.println("----->>> test manager "+managerFactory);
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactoryImpl managerFactory) {
        AbstractController.managerFactory = managerFactory;
    }
    
}

