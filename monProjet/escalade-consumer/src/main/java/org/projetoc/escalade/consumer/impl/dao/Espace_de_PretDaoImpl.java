package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import org.projetoc.escalade.consumer.contract.dao.Espace_de_PretDao;
import org.projetoc.escalade.model.Espace_de_Pret;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

public class Espace_de_PretDaoImpl extends AbstractDaoImpl implements Espace_de_PretDao {

	@Override
	public void addEspace_de_Pret(Espace_de_Pret pret) {
		String sql = "INSERT INTO espace_de_pret (disponible, date_de_location, authorProprio) VALUES (:pret_disponible ,:pret_date_de_location , :pret_authorProprio );";
		
		MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("pret_disponible", pret.isDisponible(), Types.BOOLEAN);
        args.addValue("pret_date_de_location", pret.getDate_de_location(), Types.VARCHAR);
        args.addValue("pret_authorProprio", pret.getAuthorProprio(), Types.VARCHAR);
        
        try {
            getNamedParameterJdbcTemplate().update(sql, args);
        } catch (DuplicateKeyException exception) {
            System.out.println(exception.getMessage());
        }
		
	}

	/* SELECT*/
	@Override
	public Espace_de_Pret getEspace_de_Pret(Espace_de_Pret pret) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEspace_de_PretPicture(Espace_de_Pret pret) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEspace_de_Pret(Espace_de_Pret pret) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEspace_de_Pret(Espace_de_Pret pret) {
		// TODO Auto-generated method stub
		
	}

}
