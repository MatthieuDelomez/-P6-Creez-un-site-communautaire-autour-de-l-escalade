package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import org.projetoc.escalade.consumer.contract.dao.UtilisateurDao;
import org.projetoc.escalade.model.Utilisateur;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

public class UtilisateurDaoImpl extends AbstractDaoImpl implements UtilisateurDao {

	@Override
	public void addUser(Utilisateur user) {

		String sql = "INSERT INTO utilisateur (pseudo, nom, prenom, email) VALUES (:user_pseudo ,:user_nom , :user_prenom, :user_email );";
		
		MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("user_pseudo", user.getNom(), Types.VARCHAR);
        args.addValue("user_nom", user.getPrenom(), Types.VARCHAR);
        args.addValue("user_prenom", user.getPrenom(), Types.VARCHAR);
        args.addValue("user_email", user.getPrenom(), Types.VARCHAR);


	}

	@Override
	public Utilisateur getUser(Utilisateur user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserPicture(Utilisateur user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(Utilisateur user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(Utilisateur user) {
		// TODO Auto-generated method stub

	}

}
