package RowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.projetoc.escalade.model.Publication;

public class PublicationMapper implements RowMapper<Publication> {

	public Publication mapRow(ResultSet rs, int rowNum) throws SQLException {
		Publication publication = new Publication();
		publication.setTitre(rs.getString("TITRE"));
		publication.setDescription(rs.getString("DESCRIPTION"));
		publication.setDate_maj(rs.getString("DATE_MAJ"));
		publication.setPseudo(rs.getString("PSEUDO"));


		return publication;
	}
}
