package br.com.stefanini.login.persistence;

import br.com.stefanini.libraryusuario.entity.Usuario;

public class UsuarioDAO extends DAO implements IUsuarioDAO{

	@Override
	public void gravar(Usuario usuario) throws Exception {
		open();
		
		usuario.gerarCriptografia();
		usuario.setStatus("ativo");
		
		stmt = con.prepareStatement("insert into usuario values (null,?,?,?)");
		
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getEmail());
		stmt.setString(3, usuario.getSenha());
		stmt.executeUpdate();
		stmt.close();
		
		close();
		
		
		
	}

	@Override
	public Usuario logar(Usuario usuario) throws Exception {
		open();
		
		usuario.gerarCriptografia();
		usuario.setStatus("ativo");
		
		stmt = con.prepareStatement("select * from usuario where email=? and senha=?");

		stmt.setString(1, usuario.getEmail());
		stmt.setString(2, usuario.getSenha());

		rs = stmt.executeQuery();
		
		if(rs.next()) {
			usuario = new Usuario();
			usuario.setIdUsuario(rs.getInt(1));;
			usuario.setNome(rs.getString(2));
			usuario.setUuId(rs.getString(3));
			usuario.setEmail(rs.getString(4));
			usuario.setSenha(rs.getString(5));
			usuario.setStatus(rs.getString(6));
		}
		
		stmt.close();
		close();
		return usuario;
	}

}
