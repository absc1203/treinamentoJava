package br.com.stefanini.projetodb.persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.mysql.jdbc.PreparedStatement;

import br.com.stefanini.projetodb.model.Endereco;
import br.com.stefanini.projetodb.model.Usuario;

public class UsuarioDAO extends DAO {

	public void createUsuario(Usuario usuario) throws Exception {
		open();

		stmt = con.prepareStatement("insert into usuario values (null,?,?,?,?)");
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getEmail());
		stmt.setString(3, usuario.getSenha());
		stmt.setString(4, usuario.getUuId());
		stmt.executeUpdate();
		stmt.close();

		close();

	}

	public void createUsuarioEndereco(Usuario usuario) throws Exception {
		open();
		con.setAutoCommit(false);
		int chave = 0;
		try {
			//gravando tabela usuario
			stmt = con.prepareStatement("insert into usuario values (null,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getSenha());
			stmt.setString(4, usuario.getUuId());
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			rs.next();
			chave = rs.getInt(1);
			stmt.close();
			
			//gravando tabela endereco
			stmt1 = con.prepareStatement("insert into endereco values (null,?,?,?)");
			stmt1.setString(1, usuario.getEndereco().getBairro());
			stmt1.setString(2, usuario.getEndereco().getCidade());
			stmt1.setInt(3, chave);
			stmt1.executeUpdate();
			stmt1.close();
			con.setAutoCommit(true);
			con.commit();

		} catch (Exception e) {
			e.printStackTrace();
			con.rollback();
			throw new Exception(e.getMessage());
		} finally {
			con.close();
		}
	}
	
	public List<Usuario> findAllUsuarios() throws Exception{
		open();
		List<Usuario> lista = new ArrayList<>();
		stmt = con.prepareStatement("select * from usuario");
		rs = stmt.executeQuery();
		while(rs.next()) {
			Usuario usuario = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			lista.add(usuario);
		}
		close();
		return lista;
	}

	public static void main(String[] args) {

		UsuarioDAO dao = new UsuarioDAO();
		Usuario usuario = new Usuario(null, "AndreTeste3", "andreTeste3@gmail.com", "154576", UUID.randomUUID().toString());
		Endereco endereco = new Endereco(null, "centro", "Curitiba");
		usuario.setEndereco(endereco);

		try {
			usuario.gerarCriptografia();
			dao.createUsuarioEndereco(usuario);
			System.out.println("Dados gravados com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
