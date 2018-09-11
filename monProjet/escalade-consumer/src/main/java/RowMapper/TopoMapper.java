package RowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


import org.projetoc.escalade.model.Topo;

public class TopoMapper implements RowMapper<Topo> {
	
	public Topo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Topo topo = new Topo();
		topo.setRef(rs.getString("REF"));
		topo.setNom(rs.getString("NOM"));
		topo.setDescriptif(rs.getString("DESCRIPTIF"));
		topo.setNiveau_du_topo(rs.getString("NIVEAU_DU_TOPO"));
		topo.setDescriptif(rs.getString("TITRE_DE_PUBLICATION"));
		topo.setDisponible(rs.getBoolean("DISPONIBLE"));
		topo.setNom_du_site(rs.getString("NOM_DU_SITE"));


		return topo;
	}

}
