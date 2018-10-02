package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import javax.sql.DataSource;

import org.projetoc.escalade.consumer.contract.dao.UtilisateurDao;
import org.projetoc.escalade.model.Utilisateur;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import RowMapper.UtilisateurMapper;

public class UtilisateurDaoImpl implements UtilisateurDao {
	
	private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

	/*Ajouter dans la abase*/
	@Override
	public void addUser(Utilisateur user) {

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO utilisateur (pseudo, nom, prenom, email, motpasse) VALUES (?,?,?,?,?);";
		
	Object[] args = new Object[] {user.getPseudo(),user.getNom(),user.getPrenom(),user.getEmail(), user.getMotPasse()};
		
        
        try {
            jdbcTemplate.update(sql, args);
        } catch (DuplicateKeyException exception) {
            System.out.println(exception.getMessage());
        }


	}


	

	/*SELECT ++> Queryforobject
	 * Recuperer l'information dans la base de donnees 
	 * */
	
	@Override
	public Utilisateur getUser(Utilisateur user) {

		String sql = "SELECT * FROM utilisateur WHERE  pseudo= ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		Object[] args = new Object[] {
				 user.getPseudo()
		};

        
        try {
            RowMapper<Utilisateur> rowMapper = new UtilisateurMapper();
            Utilisateur userQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);
            return userQuery;

        } catch (EmptyResultDataAccessException exception) {
            System.out.println("Incorrect");
            return null;
        }
		
		
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
