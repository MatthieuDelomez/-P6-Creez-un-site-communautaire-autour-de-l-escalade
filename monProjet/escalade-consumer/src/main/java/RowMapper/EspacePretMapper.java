package RowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import org.projetoc.escalade.model.Espace_de_Pret;


public class EspacePretMapper implements RowMapper<Espace_de_Pret>{

	public Espace_de_Pret mapRow(ResultSet rs, int rowNum) throws SQLException {
		Espace_de_Pret pret = new Espace_de_Pret();
		pret.setDisponible(rs.getBoolean("disponible"));
		pret.setDate_de_location(rs.getString("date_de_location"));
		pret.setPseudo_proprio(rs.getString("pseudo_proprio"));




		return pret;
	}
}
