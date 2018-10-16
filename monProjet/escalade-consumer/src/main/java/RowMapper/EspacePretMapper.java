package RowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import org.projetoc.escalade.model.EspacePret;


public class EspacePretMapper implements RowMapper<EspacePret>{

	public EspacePret mapRow(ResultSet rs, int rowNum) throws SQLException {
		EspacePret pret = new EspacePret();
		pret.setId_pret(rs.getInt("id_pret"));
		pret.setDate_de_location(rs.getString("date_de_location"));
		pret.setPseudo_proprio(rs.getString("pseudo_proprio"));
		pret.setDisponible(rs.getBoolean("disponible"));
		pret.setRef(rs.getString("topo_ref"));





		return pret;
	}
}
