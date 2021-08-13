package br.com.stefanini.login.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.stefanini.libraryusuario.entity.Usuario;
import br.com.stefanini.login.persistence.UsuarioDAO;

@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UsuarioController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String flag = request.getParameter("flag");

			switch (flag) {
			case "gravar":
				gravar(request, response);

				break;
			case "logar":
				logar(request, response);
				break;
				
			case "logout":
				//logout(request, response);
				break;

			default:
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void logar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
//
//	protected void logout(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//	}

	protected void gravar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			Usuario usuario = new Usuario();
			usuario.setNome(request.getParameter("nome"));
			usuario.setEmail(request.getParameter("email"));
			usuario.setSenha(request.getParameter("senha"));
			new UsuarioDAO().gravar(usuario);
			request.setAttribute("msg", "Dados Gravados");
			request.getRequestDispatcher("sistema.jsp").forward(request, response);
			
		} catch (Exception e) {
			request.setAttribute("msg", "Erro na gravação");
			request.getRequestDispatcher("sistema.jsp").forward(request, response);
		}

	}

}
