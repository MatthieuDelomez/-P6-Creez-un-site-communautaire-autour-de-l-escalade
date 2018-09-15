package RowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


import org.projetoc.escalade.model.Commentaire;

public class CommentaireMapper implements RowMapper<Commentaire>{
	
	public Commentaire mapRow(ResultSet rs, int rowNum) throws SQLException {
		Commentaire commentaire = new Commentaire();
		commentaire.setId(rs.getInt("id"));
		commentaire.setPseudo(rs.getString("pseudo"));
		commentaire.setPublicationId(rs.getInt("publicationid"));
		commentaire.setTitre(rs.getString("titre"));
		commentaire.setCreatedAt(rs.getDate("createdat"));
		



		return commentaire;
	}
}
