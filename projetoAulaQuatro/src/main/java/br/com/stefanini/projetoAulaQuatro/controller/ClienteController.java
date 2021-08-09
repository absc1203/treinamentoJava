package br.com.stefanini.projetoAulaQuatro.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.stefanini.projetoAulaQuatro.dto.request.RequestCliente;
import br.com.stefanini.projetoAulaQuatro.model.Cliente;
import br.com.stefanini.projetoAulaQuatro.persistence.ClienteDAO;
import br.com.stefanini.projetoAulaQuatro.persistence.IClienteDAO;

/**
 * Servlet implementation class ClienteController
 */
@WebServlet("/ClienteController")
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClienteController() {
		super();
	}

	// Listagem
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {				

			int id = Integer.parseInt(request.getParameter("id"));
				IClienteDAO idao = new ClienteDAO();
				Cliente resp = idao.findById(id);

				if (resp != null) {
					request.setAttribute("cliente", resp);
					request.getRequestDispatcher("saidaconsulta.jsp").forward(request, response);
				} else {
					request.setAttribute("msg", "Cliente não encontrado");
					request.getRequestDispatcher("saidaerro.jsp").forward(request, response);
				}

			

		} catch (Exception e) {
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher("saidaerro.jsp").forward(request, response);
		}

	}

	// Entrada de dados
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestCliente requestClienteDTO = new RequestCliente();

		requestClienteDTO.ofCliente(request.getParameter("nome"), request.getParameter("email"), request.getParameter("senha"));
		
		

		response.getWriter().print(requestClienteDTO);

	}

}
