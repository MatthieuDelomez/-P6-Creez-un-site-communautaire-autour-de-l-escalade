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

		/* Créer un utilisateur */

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

		/* Creer Commentaire */

		commentaire.setId(2);
		commentaire.setPseudo("Macaronade");
		commentaire.setPublicationId(2);
		commentaire.setCreatedAt(date);

		commentaireDao.addCommentaire(commentaire);

		
		
		/* Récuperer Espace de Pret */

		Espace_de_PretDao espace_de_pretDao = ctx.getBean("espace_de_pretDAO", Espace_de_PretDao.class);

		Espace_de_Pret pret = new Espace_de_Pret();

		pret.setDisponible(true);

		Espace_de_Pret pret1 = espace_de_pretDao.getEspace_de_Pret(pret);

		System.out.println(pret.toString());

		
		
		/* Creer Espace de Pret */

		pret.setDisponible(true);
		pret.setDate_de_location("Du 15/09/18 au 20/10/18");
		pret.setPseudo_proprio("LaVache_de_la_Grimpouille");

		espace_de_pretDao.addEspace_de_Pret(pret);

		
		
		/* Récuperer Publication */

		PublicationDao publicationDao = ctx.getBean("publicationDAO", PublicationDao.class);

		Publication publication = new Publication();

		publication.setDate_maj("14/08/18");

		Publication publication1 = publicationDao.getPublication(publication);

		System.out.println(publication.toString());
		
		
		/* Creer Publication */

		publication.setTitre("Publication n°2 Test en java");
		publication.setDescription("Petite publication de test en java popur communiquer avec la database");
		publication.setDate_maj("15/09/18");
		publication.setPseudo("A_Exception");

		publicationDao.addPublication(publication);

		
		

		/* Récuperer Secteur */

		SecteurDao secteurDao = ctx.getBean("secteurDAO", SecteurDao.class);

		Secteur secteur = new Secteur();

		secteur.setNom_secteur("Emplacement Corail");

		Secteur secteur1 = secteurDao.getSecteur(secteur);

		System.out.println(secteur.toString());
		
		/* Creer Secteur */

		secteur.setNom_secteur("Emplacement Picon Bière");
		secteur.setNom_du_site("Site Nord 02");


		secteurDao.addSecteur(secteur);
		

		/* Récuperer Sites */

		SitesDao sitesDao = ctx.getBean("sitesDAO", SitesDao.class);

		Sites sites = new Sites();

		sites.setNom_du_site("Site Nord 01");

		Sites sites1 = sitesDao.getSites(sites);

		System.out.println(sites.toString());
		
		/* Creer Site */

		sites.setNom_du_site("Sites Nord 02");
		sites.setNombre_de_secteur(2);

		sitesDao.addSites(sites);
		
		

		/* Récuperer Topo */

		TopoDao topoDao = ctx.getBean("topoDAO", TopoDao.class);

		Topo topo = new Topo();

		topo.setNiveau_du_topo("9c");

		Topo topo1 = topoDao.getTopo(topo);

		System.out.println(topo.toString());
		
		/* Creer Topo */

		topo.setRef("Topo02");
		topo.setNom("Topo de la comète");
		topo.setDescriptif("Topo assez complexe regroupant plusieurs sites classés de 5a à 8b");
		topo.setNiveau_du_topo("5a - 8b");
		topo.setType_de_topo("Bloc");
		topo.setTitre_de_publication("Aucune publication disponible sur ce topo");
		topo.setDisponible(true);
		topo.setNom_du_site("Site Nord 02");


		topoDao.addTopo(topo);

		/* Récuperer Voies */

		VoiesDao voiesDao = ctx.getBean("voiesDAO", VoiesDao.class);

		Voies voies = new Voies();

		voies.setNom_voies("Voie N°1");

		Voies voies1 = voiesDao.getVoies(voies);

		System.out.println(voies.toString());
		
		
		/* Creer Voies */

		voies.setNom_voies("Voies N°1");
		voies.setNom_secteur("Emplacement Picon Bière");
		voies.setNom_du_site("Site Nord 02");
		
		voiesDao.addVoies(voies);

	}

}
