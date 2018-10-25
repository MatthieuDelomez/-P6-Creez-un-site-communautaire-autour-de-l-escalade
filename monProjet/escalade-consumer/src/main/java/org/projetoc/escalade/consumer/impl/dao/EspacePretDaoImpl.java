package org.projetoc.escalade.consumer.impl.dao;

import org.projetoc.escalade.consumer.contract.dao.EspacePretDao;
import org.projetoc.escalade.model.EspacePret;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import RowMapper.EspacePretMapper;

public class EspacePretDaoImpl extends AbstractDaoImpl implements EspacePretDao {

	public void addEspacePret(EspacePret pret) {
		
		JdbcTemplate jdbcTemplate = getJdbcTemplate();
		String sql = "INSERT INTO espace_de_pret ( date_de_location, pseudo_proprio,  topo_ref) VALUES (?,?,?);";
		
	Object[] args = new Object[] {pret.getDate_de_location(),pret.getPseudo_proprio(),  pret.getRef()};
		
        
        try {
            jdbcTemplate.update(sql, args);
        } catch (DuplicateKeyException exception) {
            System.out.println(exception.getMessage());
        }



	}

	public EspacePret getEspacePret(EspacePret pret) {
		String sql = "SELECT * FROM espace_de_pret WHERE disponible = ?";

		JdbcTemplate jdbcTemplate = getJdbcTemplate();

		Object[] args = new Object[] { };

		try {
			RowMapper<EspacePret> rowMapper = new EspacePretMapper();
			EspacePret pretQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);
			return pretQuery;

		} catch (EmptyResultDataAccessException exception) {
			System.out.println("Incorrect");
			return null;
		}
	}

	public void deleteEspacePretPicture(EspacePret pret) {

	}

	public void updateEspacePret(EspacePret pret) {

	}

	public void deleteEspacePret(EspacePret pret) {

	}


}
