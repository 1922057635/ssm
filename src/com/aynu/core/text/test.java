package com.aynu.core.text;

import static org.junit.Assert.*;

import java.sql.SQLException;


import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class test {
	@Autowired
	DataSource datasource;
	@Test
	public void test() throws SQLException {
		System.out.println(datasource.getClass().getName());
		System.out.println(datasource.getConnection());
	}

}
