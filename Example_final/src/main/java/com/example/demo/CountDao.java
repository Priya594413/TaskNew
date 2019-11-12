package com.example.demo;

import java.sql.Connection;
import java.sql.ResultSet;

public class CountDao {
	
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	Connection conn = DriverManager.getConnection("jdbc:oracle:oci8:
			@oracle.world", "oratest", "oratest");
					
			String sql = "SELECT * from NUMBER";
			String sql_update="";
			ResultSet rset = sql_stmt.executeQuery(sql);
			ResultSet rset_update=rset.updateRow();
			
			rset.close();
			sql_stmt.close();
			conn.close();



}
