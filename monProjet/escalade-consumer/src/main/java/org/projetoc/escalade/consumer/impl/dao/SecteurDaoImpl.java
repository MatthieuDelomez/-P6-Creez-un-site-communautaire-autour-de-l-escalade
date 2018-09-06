package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import org.projetoc.escalade.consumer.contract.dao.SecteurDao;
import org.projetoc.escalade.model.Secteur;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

public class SecteurDaoImpl extends AbstractDaoImpl implements SecteurDao{

	@Override
	public void addSecteur(Secteur secteur) {
		String sql = "INSERT INTO secteur (nom_secteur, nom_du_site) VALUES (:secteur_nom_secteur ,:secteur_nom_du_site  );";
		
		MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("secteur_nom_secteur", secteur.getNom_secteur(), Types.VARCHAR);
        args.addValue("publication_nom_du_site", secteur.getNom_du_site(), Types.VARCHAR);
       }

	@Override
	public Secteur getSecteur(Secteur secteur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSecteurPicture(Secteur secteur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSecteur(Secteur secteur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSecteur(Secteur secteur) {
		// TODO Auto-generated method stub
		
	}

}
