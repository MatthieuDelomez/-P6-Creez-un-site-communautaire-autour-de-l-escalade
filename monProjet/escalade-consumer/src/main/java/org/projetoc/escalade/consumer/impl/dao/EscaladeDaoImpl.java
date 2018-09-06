package org.projetoc.escalade.consumer.impl.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;
import javax.inject.Named;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import org.projetoc.escalade.consumer.contract.dao.EscaladeDao;
import org.projetoc.escalade.model.Utilisateur;

@Named
public class EscaladeDaoImpl extends AbstractDaoImpl implements EscaladeDao {

	@Override
    public String getPseudo(Utilisateur pseudo) {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        int vNbrTicket = vJdbcTemplate.queryForObject(
            "SELECT COUNT(*) FROM ticket",
            Integer.class);

        return vNbrTicket;
    }
}
