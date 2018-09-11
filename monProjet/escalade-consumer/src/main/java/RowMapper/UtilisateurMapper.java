package RowMapper;

import java.sql.ResultSet;


import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import org.projetoc.escalade.model.Utilisateur;

public class UtilisateurMapper implements RowMapper<Utilisateur> {
	
	public Utilisateur mapRow(ResultSet rs, int rowNum) throws SQLException {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setPseudo(rs.getString("PSEUDO"));
		utilisateur.setNom(rs.getString("NOM"));
		utilisateur.setPrenom(rs.getString("PRENOM"));
		utilisateur.setEmail(rs.getString("EMAIL"));


		return utilisateur;
	}

}
