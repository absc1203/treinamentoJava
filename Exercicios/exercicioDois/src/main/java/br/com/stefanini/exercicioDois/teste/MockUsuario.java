package br.com.stefanini.exercicioDois.teste;

import java.util.List;

import br.com.stefanini.exercicioDois.entity.Usuario;
import br.com.stefanini.exercicioDois.persistence.UsuarioDAO;

public class MockUsuario {

	public static void main(String[] args) {
		
		MockUsuario usuarioMock = new MockUsuario();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		try {
			Usuario usuario = usuarioDAO.findById(20);
			usuario.setNome("TesteAlteradoMock");
			usuarioMock.upudateUsuarioMock(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public void findAllUsuarioMock() {
		try {
			List<Usuario> usuario = new UsuarioDAO().findAllUsuario();
			System.out.println(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void findByIdUsuarioMock(Integer id) {
		try {
			Usuario usuario = new UsuarioDAO().findById(id);
			System.out.println(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createUsuarioMock(Usuario usuario) {
		try {
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			System.out.println(usuarioDAO.createUsuario(usuario));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void upudateUsuarioMock(Usuario usuario) {
		try {
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			System.out.println(usuarioDAO.updateUsuario(usuario));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteUsuarioMock(Integer id) {

		try {
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			System.out.println(usuarioDAO.deleteUsuario(id));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
