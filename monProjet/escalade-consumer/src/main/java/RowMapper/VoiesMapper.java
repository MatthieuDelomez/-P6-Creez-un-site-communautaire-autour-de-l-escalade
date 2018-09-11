package RowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.projetoc.escalade.model.Sites;
import org.projetoc.escalade.model.Voies;

public class VoiesMapper implements RowMapper<Voies> {
	
	public Voies mapRow(ResultSet rs, int rowNum) throws SQLException {
		Voies voies = new Voies();
		voies.setNom_voies(rs.getString("NOM_VOIES"));
		voies.setNom_secteur(rs.getString("NOM_SECTEUR"));
		voies.setNom_du_site(rs.getString("NOM_DU_SITE"));

		return voies;
	}
}
