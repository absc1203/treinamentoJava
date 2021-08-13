<%@page import="br.com.stefanini.manytomany.entity.*"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Many to many</title>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.0/css/bootstrap.min.css">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
</head>
<body>

	<div class="container">
		<div class="bg-dark p-5 text-white text-center">
			<h1>Relacionamento Many To Many</h1>
			<h4>Funcionario X Tarefas</h4>
		</div>

		<form action="#" class="form-control mt-3 pb-3" method="post">

			<div class="row mt-5">



				<h3 class="pb-2 ">Selecione o Funcionário e sua perspectiva
					tarefa</h3>


				<%
				List<Funcionario> listaFuncionario = (List<Funcionario>) session.getAttribute("listaFuncionario");
				out.print(listaFuncionario);
				
				%>

				<div class="col-md-5">
					<select class="form-select" name="idFuncionario">
						<option selected>Selecione o Funcionario</option>
						

					</select>
				</div>

				<div class="col-md-5">
					<select class="form-select" name="idTarefa">
						<option selected>Selecione a Tarefa</option>
						
					

					</select>
				</div>


				<div class="col-md-2">
					<button type="submit" class="btn btn-success">Relacionar</button>
				</div>


			</div>
		</form>

		<table class="table table-bordered table-hover table-striped mt-4">
			<thead class="text-center text-uppercase">
				<tr>
					<th>Código</th>
					<th>Nome</th>
					<th>Tarefa</th>
					<th>Data de Criação</th>
					<th>Ações</th>
				</tr>
			</thead>
			<tbody class="text-center">
				<tr>
					<td>10</td>
					<td>Lu</td>
					<td>Telas de Login</td>
					<td>30/06/2021</td>
					<td><a class="btn btn-outline-danger" title="Clique para apagar"><i class="fa fa-trash"></i></a>
						<a class="btn btn-outline-info" title="Clique para editar"><i class="fa fa-pencil-alt"></i></a>
						<a class="btn btn-outline-secondary" title="Clique para ver detalhes"><i class="fa fa-search"></i></a>
				</tr>
			</tbody>


		</table>
	</div>

</body>

<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.0/js/bootstrap.min.js"></script>
</html>