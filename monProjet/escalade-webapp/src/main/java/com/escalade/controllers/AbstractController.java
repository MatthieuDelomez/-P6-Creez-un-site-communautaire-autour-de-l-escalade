package com.escalade.controllers;

import com.escalade.managerImpl.ManagerFactoryImpl;

public abstract class AbstractController {

    private static ManagerFactoryImpl managerFactory;

    protected static ManagerFactoryImpl getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactoryImpl managerFactory) {
        AbstractController.managerFactory = managerFactory;
    }
    
}

