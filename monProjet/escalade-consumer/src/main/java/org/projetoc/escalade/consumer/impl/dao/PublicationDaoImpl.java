package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import org.projetoc.escalade.consumer.contract.dao.PublicationDao;
import org.projetoc.escalade.model.Publication;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

public class PublicationDaoImpl extends AbstractDaoImpl implements PublicationDao {

	@Override
	public void addPublication(Publication publication) {
		String sql = "INSERT INTO publication (titre, description, date_maj, pseudo) VALUES (:publication_titre ,:publication_description , :publication_date_maj, :publication_pseudo );";
		
		MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("publication_titre", publication.getTitre(), Types.VARCHAR);
        args.addValue("publication_description", publication.getDescription(), Types.VARCHAR);
        args.addValue("publication_date_maj", publication.getDate_maj(), Types.VARCHAR);
        args.addValue("publication_pseudo", publication.getPseudo(), Types.VARCHAR);
		
	}

	@Override
	public Publication getPublication(Publication publication) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePublicationPicture(Publication publication) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePublication(Publication publication) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePublication(Publication publication) {
		// TODO Auto-generated method stub
		
	}

}
