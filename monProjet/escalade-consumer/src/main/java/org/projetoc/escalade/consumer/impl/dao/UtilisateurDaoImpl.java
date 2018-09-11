package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import org.projetoc.escalade.consumer.contract.dao.UtilisateurDao;
import org.projetoc.escalade.model.Utilisateur;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import RowMapper.UtilisateurMapper;

public class UtilisateurDaoImpl extends AbstractDaoImpl implements UtilisateurDao {

	/*Ajouter dans la abase*/
	@Override
	public void addUser(Utilisateur user) {

		String sql = "INSERT INTO utilisateur (pseudo, nom, prenom, email) VALUES (:user_pseudo ,:user_nom , :user_prenom, :user_email );";
		
		MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("user_pseudo", user.getNom(), Types.VARCHAR);
        args.addValue("user_nom", user.getPrenom(), Types.VARCHAR);
        args.addValue("user_prenom", user.getPrenom(), Types.VARCHAR);
        args.addValue("user_email", user.getPrenom(), Types.VARCHAR);
        
        try {
            getNamedParameterJdbcTemplate().update(sql, args);
        } catch (DuplicateKeyException exception) {
            System.out.println(exception.getMessage());
        }


	}

	/*SELECT ++> Queryforobject
	 * Recuperer l'information dans la base de donnees 
	 * */
	
	@Override
	public Utilisateur getUser(Utilisateur user) {

		String sql = "SELECT * FROM utilisateur WHERE email = :user_email AND pseudo= :user_pseudo;";
		
		MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("user_email", user.getEmail(), Types.VARCHAR);
        args.addValue("pseudo", "matthieu", Types.VARCHAR);
        
        try {
            RowMapper<Utilisateur> rowMapper = new UtilisateurMapper();
            Utilisateur userQuery = getNamedParameterJdbcTemplate().queryForObject(sql, args, rowMapper);
            

        } catch (EmptyResultDataAccessException exception) {
            System.out.println("Incorrect");
            return null;
        }
		
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
