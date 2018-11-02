/**
 *  Controller chargé de synchroniser le Model et la Vue
 *  Récupérer les données utilisateur pour les filitrer via  
 *  le model et déléguer la production de sortie à la vue.
 * @author Matthieu Delomez
 */
package com.escalade.controllers;

import com.escalade.business.managerImpl.ManagerFactoryImpl;

/*
Classe Mère dont va dépendre toutes les classes Controller
*/
public abstract class AbstractController {

    // Importation de l'implémentation ManagerFactory
    private static ManagerFactoryImpl managerFactory;

    protected static ManagerFactoryImpl getManagerFactory() {
        System.out.println("----->>> test manager "+managerFactory);
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactoryImpl managerFactory) {
        AbstractController.managerFactory = managerFactory;
    }
    
}

