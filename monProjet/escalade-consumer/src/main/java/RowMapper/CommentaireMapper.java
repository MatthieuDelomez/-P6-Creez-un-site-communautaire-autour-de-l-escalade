package RowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import org.projetoc.escalade.model.Commentaire;

/* 
Implementation pour définir le mapping entre les lignes de résultats d'une requête Sql et les objets java à créer.
*/

public class CommentaireMapper implements RowMapper<Commentaire>{
    
	
	public Commentaire mapRow(ResultSet rs, int rowNum) throws SQLException {
		Commentaire commentaire = new Commentaire();
		commentaire.setId(rs.getInt("id"));
		commentaire.setTitre(rs.getString("titre"));
		commentaire.setPseudo(rs.getString("pseudo"));
		commentaire.setPublicationId(rs.getInt("publicationid"));
		commentaire.setCreatedAt(rs.getDate("createdat"));


		return commentaire;
	}
}
