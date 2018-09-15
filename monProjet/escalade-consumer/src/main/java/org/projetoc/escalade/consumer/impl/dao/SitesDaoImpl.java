package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import org.projetoc.escalade.consumer.contract.dao.SitesDao;
import org.projetoc.escalade.model.Espace_de_Pret;
import org.projetoc.escalade.model.Sites;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import RowMapper.EspacePretMapper;
import RowMapper.SitesMapper;

public class SitesDaoImpl extends AbstractDaoImpl implements SitesDao {

	@Override
	public void addSites(Sites sites) {
		String sql = "INSERT INTO sites (nom_du_site, nombre_de_secteur) VALUES (?, ?);";
		
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
		String sql = "SELECT * FROM sites WHERE nom_du_site = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		Object[] args = new Object[] { sites.getNom_du_site() };

		try {
			RowMapper<Sites> rowMapper = new SitesMapper();
			Sites sitesQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);
			return sitesQuery;

		} catch (EmptyResultDataAccessException exception) {
			System.out.println("Incorrect");
			return null;
		}
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
