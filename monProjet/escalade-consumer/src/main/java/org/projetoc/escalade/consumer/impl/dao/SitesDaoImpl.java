package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import org.projetoc.escalade.consumer.contract.dao.SitesDao;
import org.projetoc.escalade.model.Sites;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

public class SitesDaoImpl extends AbstractDaoImpl implements SitesDao {

	@Override
	public void addSites(Sites sites) {
		String sql = "INSERT INTO sites (nom_du_site, nombre_de_secteur) VALUES (:sites_nom_du_site ,:sites_nombre_de_secteur);";
		
		MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("sites_nom_du_site", sites.getNom_du_site(), Types.VARCHAR);
        args.addValue("sites_nombre_de_secteur", sites.getNombre_de_secteur(), Types.INTEGER);
        
        try {
            getNamedParameterJdbcTemplate().update(sql, args);
        } catch (DuplicateKeyException exception) {
            System.out.println(exception.getMessage());
        }
      }

	@Override
	public Sites getSites(Sites sites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSitesPicture(Sites sites) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSites(Sites sites) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSites(Sites sites) {
		// TODO Auto-generated method stub
		
	}

}
