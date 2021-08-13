package br.com.stefanini.exercicioTres.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO implements IDAO {

	Connection con;
	PreparedStatement stmt;
	ResultSet rs;

	@Override
	public void open() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdexerciciotres?useSSL=false", "root", "root");
	}

	@Override
	public void close() throws Exception {
		con.close();

	}

}
