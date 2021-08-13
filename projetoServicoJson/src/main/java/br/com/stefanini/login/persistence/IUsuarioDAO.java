package br.com.stefanini.login.persistence;

import br.com.stefanini.libraryusuario.entity.Usuario;

public interface IUsuarioDAO {
	
	public void gravar(Usuario usuario) throws Exception;
	
	public Usuario logar(Usuario usuario) throws Exception;

}
