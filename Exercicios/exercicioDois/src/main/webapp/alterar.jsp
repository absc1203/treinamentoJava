<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="br.com.stefanini.exercicioDois.persistence.UsuarioDAO"%>
<%@ page import="br.com.stefanini.exercicioDois.entity.Usuario"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD USUÁRIO</title>

<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.0/css/bootstrap.min.css">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

</head>

<body>




	<h1 class="bg-dark text-white text-center p-5">Alterar de Usuario</h1>

	<div class="col-md-6 offset-md-3 mt-5">
		<div class="card">
			<div class="card-body">

				<form action="UsuarioController" method="post" class="form">
				
				<%
				
				Usuario usuario = new Usuario();
				UsuarioDAO usuarioDAO = new UsuarioDAO();
				String id = request.getParameter("id");
				usuario = usuarioDAO.findById(Integer.parseInt(id));
				
				%>

					
					<label><i class="fas fa-user"></i> Nome:</label> 
					<input class="form-control" type="text" name="nome" value="<% out.print(usuario.getNome()); %>">
					<label class="mt-3"><i class="fas fa-envelope"></i> Email:</label>
					<input class="form-control" type="email" name="email" value="<% out.print(usuario.getEmail()); %>">
					<label class="mt-3"><i class="fas fa-lock"></i> Senha:</label>
					<input class="form-control" type="password" name="senha" value="<% out.print(usuario.getSenha()); %>">
					
					<input type="hidden" value="alterar" name="flag">
					<button class="btn btn-success mt-3" type="submit">
						Alterar <i class="far fa-save"></i>
					</button>

				</form>

			</div>


		</div>


	</div>



</body>
</html>