package com.oksoft.generators;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class SsnIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		Long ssnNum=100000000l;
		

		Connection connection = session.connection();
		try {
			Statement statement = connection.createStatement();
			String sql="SELECT SSA_PRTL_NO_SEQ.NEXTVAL FROM DUAL";
			ResultSet resultSet = statement.executeQuery(sql);
			    if(resultSet.next()) {
			    	ssnNum=resultSet.getLong(1);
			    }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ssnNum;
	}

}
