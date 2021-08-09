package br.com.stefanini.projetodb.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {

	Connection con; // acesso ao database
	PreparedStatement stmt;// acesso a tabela (create, update e delete)
	PreparedStatement stmt1;
	ResultSet rs; // consulta (read)
	
	//Abrir e fechar o banco
	
	public void open() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdUm?useSSL=false&relaxAutoCommit=true", "root", "root");
	}
	
	
	
	
	public void close() throws Exception{
		con.close();
	}

}
