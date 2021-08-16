package br.com.stefanini.exercicioDois.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import br.com.stefanini.exercicioDois.entity.Usuario;
import br.com.stefanini.exercicioDois.persistence.UsuarioDAO;

public class UsuarioAction extends ActionSupport implements ModelDriven<Usuario> {

	private static final long serialVersionUID = 1L;

	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private UsuarioDAO usuarioDAO = new UsuarioDAO();

	@Override
	public Usuario getModel() {
		return usuario;
	}

	public String createUsuario() {
		try {
			usuarioDAO.createUsuario(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "SUCCESS";
	}

	public String updateUsuario() {
		try {
			usuarioDAO.updateUsuario(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "SUCCESS";
	}

	public String deleteUsuario() {

		try {
			HttpServletRequest request = (HttpServletRequest) ActionContext.getContext()
					.get(ServletActionContext.HTTP_REQUEST);
			usuarioDAO.deleteUsuario(Integer.parseInt(request.getParameter("id")));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "SUCCESS";
	}

	public String findAllUsuario() {

		try {
			usuarioDAO.findAllUsuario();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "SUCCESS";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

}
