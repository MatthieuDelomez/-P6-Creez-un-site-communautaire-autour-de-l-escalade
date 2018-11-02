package org.projetoc.escalade.consumer.impl.dao;

import org.projetoc.escalade.consumer.contract.dao.TopoDao;
import org.projetoc.escalade.model.Topo;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import RowMapper.TopoMapper;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

/*
Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
*/

public class TopoDaoImpl extends AbstractDaoImpl implements TopoDao {

                   /* Méthode pour ajouter un topo*/

	@Override /*Classe hérité de la classe Parente AbstractDaoImpl*/
	public void addTopo(Topo topo) {

		JdbcTemplate jdbcTemplate = getJdbcTemplate();
                                      /* Nom des colonnes se situant dans table de la base de données*/
		String sql = "INSERT INTO topo (ref, nom, descriptif, niveau_du_topo, type_de_topo, nom_du_site) VALUES (?,?,?,?,?,?)";

		Object[] args = new Object[] { topo.getRef(), topo.getNom(), topo.getDescriptif(), topo.getNiveau_du_topo(), topo.getType_de_topo(), topo.getNom_du_site() };

		try {
			jdbcTemplate.update(sql, args);
		} catch (DuplicateKeyException exception) {
			System.out.println(exception.getMessage());
		}

		

	}
        
                   /* Méthode pour récupérer un topo */

	@Override /*Classe hérité de la classe Parente AbstractDaoImpl*/
	public Topo getTopo(Topo topo) {

		String sql = "SELECT * FROM topo WHERE niveau_du_topo = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		Object[] args = new Object[] { topo.getNiveau_du_topo() };

		try {
			RowMapper<Topo> rowMapper = new TopoMapper();
			Topo topoQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);
			return topoQuery;

		} catch (EmptyResultDataAccessException exception) {
			System.out.println("Incorrect");
			return null;
		}

	}
        

                   /* Méthode pour récuperer une liste de topo dans la table Topo de la base de données */

                   @Override /*Classe hérité de la classe Parente AbstractDaoImpl*/
	public List<Topo> getAllTopo() {
            
                                                         /*Log console*/
			System.out.println("Topo dans le GameCircus");

                                     String sql = "SELECT * FROM topo";

		JdbcTemplate jdbcTemplate = getJdbcTemplate();

		try {
                                                         /* Appel à la méthode BeanPropertyRowMapper */
			List<Topo> topoQuery = jdbcTemplate.query(sql,
			new BeanPropertyRowMapper(Topo.class));
			return topoQuery;

		} catch (EmptyResultDataAccessException exception) {
			System.out.println("Incorrect");
			return null;
		}
            

	}

	@Override
	public void deleteTopoPicture(Topo topo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTopo(Topo topo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTopo(Topo topo) {
		// TODO Auto-generated method stub

	}

}
