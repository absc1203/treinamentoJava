package br.com.stefanini.projetoAulaQuatro.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DAO implements IDAO {
	
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	
	public void open() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdQuatro?useSSL=false", "root", "root");
		
	}
	
	public void close() throws Exception {
		con.close();
	}

}
