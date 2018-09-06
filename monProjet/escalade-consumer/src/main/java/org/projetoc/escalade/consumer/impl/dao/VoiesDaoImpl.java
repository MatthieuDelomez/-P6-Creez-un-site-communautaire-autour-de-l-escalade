package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import org.projetoc.escalade.consumer.contract.dao.VoiesDao;
import org.projetoc.escalade.model.Voies;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

public class VoiesDaoImpl extends AbstractDaoImpl implements VoiesDao {

	@Override
	public void addVoies(Voies voies) {
		String sql = "INSERT INTO voies ( nom_voies, nom_secteur, nom_du_site) VALUES (:voies_nom_voies , :voies_nom_secteur, :voies_nom_du_site );";

		MapSqlParameterSource args = new MapSqlParameterSource();
		args.addValue("voies_nom_voies", voies.getNom_voies(), Types.VARCHAR);
		args.addValue("voies_nom_secteur", voies.getNom_secteur(), Types.VARCHAR);
		args.addValue("voies_nom_du_site", voies.getNom_du_site(), Types.VARCHAR);

	}

	@Override
	public Voies getVoies(Voies voies) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteVoiesPicture(Voies voies) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateVoies(Voies voies) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteVoies(Voies voies) {
		// TODO Auto-generated method stub

	}

}
