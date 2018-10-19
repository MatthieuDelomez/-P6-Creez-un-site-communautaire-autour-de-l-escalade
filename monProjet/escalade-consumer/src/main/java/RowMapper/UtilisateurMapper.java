package RowMapper;

import java.sql.ResultSet;


import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import org.projetoc.escalade.model.Utilisateur;

public class UtilisateurMapper implements RowMapper<Utilisateur> {
	
	public Utilisateur mapRow(ResultSet rs, int rowNum) throws SQLException {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setPseudo(rs.getString("pseudo"));
		utilisateur.setNom(rs.getString("nom"));
		utilisateur.setPrenom(rs.getString("prenom"));
		utilisateur.setEmail(rs.getString("email"));
                                      utilisateur.setMotPasse(rs.getString("motpasse"));


		return utilisateur;
	}

}
