package br.com.stefanini.exercicioDois.persistence;

import java.util.List;

import br.com.stefanini.exercicioDois.entity.Usuario;

public interface IUsuarioDAO {

	public List<Usuario> findAllUsuario() throws Exception;

	public Usuario findById(Integer id) throws Exception;

	public String createUsuario(Usuario usuario) throws Exception;

	public String updateUsuario(Usuario usuario) throws Exception;

	public String deleteUsuario(Integer id) throws Exception;

}
