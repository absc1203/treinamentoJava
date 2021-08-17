package br.com.stefanini.exercicioDois.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.stefanini.exercicioDois.entity.Usuario;
import br.com.stefanini.exercicioDois.persistence.UsuarioDAO;

/**
 * Servlet implementation class UsuarioController
 */
@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UsuarioController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			List<Usuario> usuarios = new ArrayList<>();
			usuarios = new UsuarioDAO().findAllUsuario();

			request.setAttribute("usuarios", usuarios);
			request.getRequestDispatcher("/index.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String flag = request.getParameter("flag");
		switch (flag) {
		case "cadastrar":
			cadastrar(request, response);
			break;

		case "alterar":
			alterar(request, response);
			break;

		}

	}

	protected void cadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Usuario usuario = new Usuario(request.getParameter("nome"), request.getParameter("email"),
				request.getParameter("senha"));
		UsuarioDAO usuarioDAO = new UsuarioDAO();

		try {
			usuarioDAO.createUsuario(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/index.jsp").forward(request, response);

	}

	protected void alterar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Usuario usuario = new Usuario();
		UsuarioDAO usuarioDAO = new UsuarioDAO();

		try {

			String id = request.getParameter("id");

			usuario = usuarioDAO.findById(Integer.parseInt(id));

			usuario.setNome(request.getParameter("nome"));
			usuario.setEmail(request.getParameter("email"));
			usuario.setSenha(request.getParameter("senha"));

			usuarioDAO.updateUsuario(usuario);

			request.getRequestDispatcher("/index.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
