package br.com.stefanini.exercicioDois.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.exercicioDois.entity.Usuario;

public class UsuarioDAO extends DAO implements IUsuarioDAO {

	@Override
	public List<Usuario> findAllUsuario() throws Exception {
		open();
		stmt = con.prepareStatement("select * from usuario");
		rs = stmt.executeQuery();
		List<Usuario> usuarios = new ArrayList<>();
		while (rs.next()) {
			Usuario usuario = new Usuario();
			usuario.setIdUsuario(rs.getInt(1));
			usuario.setNome(rs.getString(2));
			usuario.setEmail(rs.getString(3));
			usuario.setSenha(rs.getString(4));
			usuarios.add(usuario);
		}

		close();
		return usuarios;
	}

	@Override
	public Usuario findById(Integer id) throws Exception {
		open();
		stmt = con.prepareStatement("select * from usuario where idUsuario=?");
		stmt.setInt(1, id);
		rs = stmt.executeQuery();
		Usuario usuario = null;
		if (rs.next()) {
			usuario = new Usuario();
			usuario.setIdUsuario(rs.getInt(1));
			usuario.setNome(rs.getString(2));
			usuario.setEmail(rs.getString(3));
			usuario.setSenha(rs.getString(4));
		}
		close();
		return usuario;
	}

	@Override
	public String createUsuario(Usuario usuario) throws Exception {
		open();
		stmt = con.prepareStatement("insert into usuario (nome, email, senha) values (?, ?, ?);");
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getEmail());
		stmt.setString(3, usuario.getSenha());
		stmt.executeUpdate();

		close();
		return "Usuario cadastrado com sucesso!";

	}

	@Override
	public String updateUsuario(Usuario usuario) throws Exception {
		open();
		stmt = con.prepareStatement("update usuario set nome=? , email=?, senha=? where idUsuario=?");
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getEmail());
		stmt.setString(3, usuario.getSenha());
		stmt.setInt(4, usuario.getIdUsuario());
		stmt.executeUpdate();

		close();
		return "Usuario alterado com sucesso!";

	}

	@Override
	public String deleteUsuario(Integer id) throws Exception {
		open();
		stmt = con.prepareStatement("delete from usuario where idUsuario=?");
		stmt.setInt(1, id);
		stmt.executeUpdate();
		
		
		close();
		return "Usuario deletado com sucesso!";

	}

	public static void main(String[] args) {
		try {
			UsuarioDAO dao = new UsuarioDAO();
			System.out.println(dao.deleteUsuario(3));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
