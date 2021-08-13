package br.com.stefanini.manytomany.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.stefanini.manytomany.entity.Funcionario;
import br.com.stefanini.manytomany.entity.Tarefa;
import br.com.stefanini.manytomany.persistence.FuncionarioDAO;
import br.com.stefanini.manytomany.persistence.TarefaDAO;

 
@WebServlet("/TarefaFuncionarioController")
public class TarefaFuncionarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public TarefaFuncionarioController() {
        super();
       
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   try {
		 
		   Integer code = new Integer(request.getParameter("code")); //Parameter

		   Funcionario existe = new FuncionarioDAO().findById(code);
		   HttpSession session = request.getSession(true);
		    if (existe!=null) {
		    
		
		      List<Funcionario> listaf = new FuncionarioDAO().findAllFuncionario();
		      List<Tarefa> listat = new TarefaDAO().findAllTarefa();
		  
		      session.setAttribute("listaf", listaf); 
		      session.setAttribute("listat", listat); 
			  response.sendRedirect("resposta.jsp");
		    }else {
              session.setAttribute("invalido", "erro do Usuario ..." );
              response.sendRedirect("error.jsp");
		    }
		    
		
	   }catch(Exception ex) {
		   ex.printStackTrace();
	   }
	}

}
