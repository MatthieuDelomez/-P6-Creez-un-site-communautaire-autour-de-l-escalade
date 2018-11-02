package RowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import org.projetoc.escalade.model.Secteur;

/* 
Implementation pour définir le mapping entre les lignes de résultats d'une requête Sql et les objets java à créer.
*/

public class SecteurMapper implements RowMapper<Secteur> {
    
	
	public Secteur mapRow(ResultSet rs, int rowNum) throws SQLException {
		Secteur secteur = new Secteur();
		secteur.setNom_secteur(rs.getString("nom_secteur"));
		secteur.setNom_du_site(rs.getString("nom_du_site"));

                
		return secteur;
	}
}
