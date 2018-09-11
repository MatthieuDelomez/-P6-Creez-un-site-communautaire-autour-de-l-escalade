package RowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import org.projetoc.escalade.model.Espace_de_Pret;


public class EspacePretMapper implements RowMapper<Espace_de_Pret>{

	public Espace_de_Pret mapRow(ResultSet rs, int rowNum) throws SQLException {
		Espace_de_Pret pret = new Espace_de_Pret();
		pret.setDisponible(rs.getBoolean("DISPONIBLE"));
		pret.setDate_de_location(rs.getString("DATE_DE_LOCATION"));
		pret.setAuthorProprio(rs.getString("AUTHORPROPRIO"));




		return pret;
	}
}
