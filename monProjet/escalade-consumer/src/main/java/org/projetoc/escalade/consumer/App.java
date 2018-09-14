package org.projetoc.escalade.consumer;

import org.projetoc.escalade.consumer.contract.dao.UtilisateurDao;
import org.projetoc.escalade.model.Utilisateur;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		UtilisateurDao userDao = ctx.getBean("utilisateurDAO", UtilisateurDao.class);

		Utilisateur user = new Utilisateur();
		

		user.setPseudo("John59820");
		user.setNom("John");
		user.setPrenom("Carpenter");
		user.setEmail("Jojo@hotmail.com");
		
		//userDao.addUser(user);
		
		
		user.setPseudo("Dalton01");
		
		Utilisateur user1 = userDao.getUser(user);
		
		System.out.println(user1.toString());

		
	}
	
	
}
