package org.projetoc.escalade.consumer;

import java.util.Date;

import org.projetoc.escalade.consumer.contract.dao.CommentaireDao;
import org.projetoc.escalade.consumer.contract.dao.Espace_de_PretDao;
import org.projetoc.escalade.consumer.contract.dao.PublicationDao;
import org.projetoc.escalade.consumer.contract.dao.SecteurDao;
import org.projetoc.escalade.consumer.contract.dao.SitesDao;
import org.projetoc.escalade.consumer.contract.dao.TopoDao;
import org.projetoc.escalade.consumer.contract.dao.UtilisateurDao;
import org.projetoc.escalade.consumer.contract.dao.VoiesDao;
import org.projetoc.escalade.model.Commentaire;
import org.projetoc.escalade.model.Espace_de_Pret;
import org.projetoc.escalade.model.Publication;
import org.projetoc.escalade.model.Secteur;
import org.projetoc.escalade.model.Sites;
import org.projetoc.escalade.model.Topo;
import org.projetoc.escalade.model.Utilisateur;
import org.projetoc.escalade.model.Voies;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		
		/*Créer un utilisateur*/
		
		UtilisateurDao utilisateurDao = ctx.getBean("utilisateurDAO", UtilisateurDao.class);

		Utilisateur user = new Utilisateur();

		/*
		 * user.setPseudo("John59820"); user.setNom("John");
		 * user.setPrenom("Carpenter"); user.setEmail("Jojo@hotmail.com");
		 * 
		 */

		// userDao.addUser(user);
		
		
		
		/* Récupérer Commentaire */
		
		CommentaireDao commentaireDao = ctx.getBean("commentaireDAO", CommentaireDao.class);


		Commentaire commentaire = new Commentaire();
		Date date = new Date();

		commentaire.setPseudo("Dalton01");

		Commentaire commentaire1 = commentaireDao.getCommentaire(commentaire);

		System.out.println(commentaire.toString());
		
		

		/* Récuperer Espace de Pret */

		Espace_de_PretDao espace_de_pretDao = ctx.getBean("espace_de_pretDAO", Espace_de_PretDao.class);

		Espace_de_Pret pret = new Espace_de_Pret();

		pret.setDisponible(true);

		Espace_de_Pret pret1 = espace_de_pretDao.getEspace_de_Pret(pret);

		System.out.println(pret.toString());
		
		

		/* Récuperer Publication */

		PublicationDao publicationDao = ctx.getBean("publicationDAO", PublicationDao.class);

		Publication publication = new Publication();

		publication.setDate_maj("14/08/18");

		Publication publication1 = publicationDao.getPublication(publication);

		System.out.println(publication.toString());
		
		
		
		/* Récuperer Secteur */

		SecteurDao secteurDao = ctx.getBean("secteurDAO", SecteurDao.class);

		Secteur secteur = new Secteur();

		secteur.setNom_secteur("Emplacement Corail");

		Secteur secteur1 = secteurDao.getSecteur(secteur);

		System.out.println(secteur.toString());
		
		
		/* Récuperer Sites */

		SitesDao sitesDao = ctx.getBean("sitesDAO", SitesDao.class);

		Sites sites = new Sites();

		sites.setNom_du_site("Site Nord 01");

		Sites sites1 = sitesDao.getSites(sites);

		System.out.println(sites.toString());
		
		
		/* Récuperer Topo */

		TopoDao topoDao = ctx.getBean("topoDAO", TopoDao.class);

		Topo topo = new Topo();

		topo.setNiveau_du_topo("9c");

		Topo topo1 = topoDao.getTopo(topo);

		System.out.println(topo.toString());
		
		
		/* Récuperer Voies */

		VoiesDao voiesDao = ctx.getBean("voiesDAO", VoiesDao.class);

		Voies voies = new Voies();

		voies.setNom_voies("Voie N°1");

		Voies voies1 = voiesDao.getVoies(voies);

		System.out.println(voies.toString());


	}

}
