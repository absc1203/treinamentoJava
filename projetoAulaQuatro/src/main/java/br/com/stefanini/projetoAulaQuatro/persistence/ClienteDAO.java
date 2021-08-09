package br.com.stefanini.projetoAulaQuatro.persistence;

import java.sql.PreparedStatement;

import br.com.stefanini.projetoAulaQuatro.model.Cliente;

public class ClienteDAO extends DAO implements IClienteDAO {

	@Override
	public Cliente findById(int id) throws Exception {

		open();

		stmt = con.prepareStatement("select * from cliente where id=?");
		stmt.setInt(1, id);
		rs = stmt.executeQuery();
		Cliente cliente = null;
		if (rs.next()) {
			cliente = new Cliente();
			cliente.setId(rs.getInt(1));
			cliente.setNome(rs.getString(2));
			cliente.setEmail(rs.getString(3));
			cliente.setSenha(rs.getString(4));
			cliente.setDataCriacao(rs.getDate(5));

		}

		close();

		return cliente;
	}

	public Integer createClienteTelefone(Cliente cliente) throws Exception {

		open();
		con.setAutoCommit(false);

		try {

			stmt = con.prepareStatement("insert into cliente values (null,?,?,md5(?),?)", PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getSenha());
			stmt.setDate(4, new java.sql.Date(cliente.getDataCriacao().getTime()));
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			rs.next();
			int key = rs.getInt(1);
			stmt.close();
			
			
			con.setAutoCommit(true);
			con.commit();
		}

		catch (Exception e) {
			con.rollback();
			e.printStackTrace();

		} finally {
			close();
		}

		return null;

	}

}
