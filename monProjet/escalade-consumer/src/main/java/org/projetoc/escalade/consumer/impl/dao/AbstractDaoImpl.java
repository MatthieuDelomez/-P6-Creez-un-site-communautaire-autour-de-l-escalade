package org.projetoc.escalade.consumer.impl.dao;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public abstract class AbstractDaoImpl {

	@Inject
	@Named("dataSourceEscalade")
	public static DataSource dataSource;

	protected DataSource getDataSource() {
		return dataSource;
	}
	
	static JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(dataSource);
    }

    static NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
        return new NamedParameterJdbcTemplate(dataSource);
    }
    
    public static void setDataSource(DataSource dataSource) {
        AbstractDaoImpl.dataSource = dataSource;
    }

}
