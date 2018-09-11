package RowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


import org.projetoc.escalade.model.Commentaire;

public class CommentaireMapper implements RowMapper<Commentaire>{
	
	public Commentaire mapRow(ResultSet rs, int rowNum) throws SQLException {
		Commentaire commentaire = new Commentaire();
		commentaire.setId(rs.getInt("ID"));
		commentaire.setUserAccountId(rs.getInt("USERACCOUNTID"));
		commentaire.setPublicationId(rs.getInt("PUBLICATIONID"));
		commentaire.setParentId(rs.getInt("PARENTID"));
		commentaire.setCreatedAt(rs.getDate("CREATEDAT"));
		commentaire.setUpdateAt(rs.getDate("UPDATEAT"));
		commentaire.setContent(rs.getString("CONTENT"));



		return commentaire;
	}
}
