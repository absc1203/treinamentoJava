<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import = "br.com.stefanini.exercicioDois.persistence.UsuarioDAO" %>
<%@ page import = "br.com.stefanini.exercicioDois.entity.Usuario" %>
<%@ page import = "java.util.List" %>
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
	<h1 class="bg-dark text-white text-center p-5">Gravação de Usuario</h1>

	<div class="col-md-6 offset-md-3 mt-5">
		<div class="card">
			<div class="card-body">

				<form
					action="UsuarioController"
					method="post" class="form">

					<label><i class="fas fa-user"></i> Nome:</label> <input
						class="form-control" type="text" name="nome"
						placeholder="Digite o nome completo"> <label class="mt-3"><i
						class="fas fa-envelope"></i> Email:</label> <input class="form-control"
						type="email" name="email" placeholder="Digite o email"> <label
						class="mt-3"><i class="fas fa-lock"></i> Senha:</label> <input
						class="form-control" type="password" name="senha"
						placeholder="Digite a senha">
					<input type="hidden" value="cadastrar" name="flag">
					<button class="btn btn-success mt-3" type="submit">
						Gravar <i class="far fa-save"></i>
					</button>
				</form>

			</div>


		</div>


	</div>

	<div class="container mt-5">
		<table class="table table-bordered table-striped table-hover">
			<thead class="text-center bg-dark text-white">
				<tr>
					<th>Código</th>
					<th>Nome</th>
					<th>Email</th>
					<th>Ações</th>
				</tr>
			</thead>

			<tbody class="text-center">


				<%
					UsuarioDAO usuarioDAO = new UsuarioDAO();
					List<Usuario> usuarios = usuarioDAO.findAllUsuario();
					
					
					for(Usuario usuario : usuarios) {
				%>



				<tr>
					<td><%out.print(usuario.getIdUsuario());%></td>
					<td><%out.print(usuario.getNome());%></td>
					<td><%out.print(usuario.getEmail());%></td>
					
					<td><a href="alterar.jsp?id=<%out.print(usuario.getIdUsuario());%>" class="btn btn-info"
						title="Clique para Editar"><i class="fas fa-user-edit"></i></a> <a
						href="index.jsp?id=<%out.print(usuario.getIdUsuario());%>" class="btn btn-danger" title="Clique para Apagar"><i
							class="fas fa-trash-alt"></i></a></td>
				</tr>
		<% } %>


		<%
		
		try{
			String id = request.getParameter("id");		
			usuarioDAO.deleteUsuario(Integer.parseInt(id));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		%>


			</tbody>

		</table>

	</div>






</body>
</html>