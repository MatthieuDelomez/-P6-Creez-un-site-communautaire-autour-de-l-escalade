package RowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import org.projetoc.escalade.model.Publication;

/* 
Implementation pour définir le mapping entre les lignes de résultats d'une requête Sql et les objets java à créer.
*/

public class PublicationMapper implements RowMapper<Publication> {

	public Publication mapRow(ResultSet rs, int rowNum) throws SQLException {
		Publication publication = new Publication();
		publication.setTitre(rs.getString("titre"));
		publication.setDescription(rs.getString("description"));
		publication.setDate_maj(rs.getString("date_maj"));
		publication.setPseudo(rs.getString("pseudo"));


		return publication;
	}
}
