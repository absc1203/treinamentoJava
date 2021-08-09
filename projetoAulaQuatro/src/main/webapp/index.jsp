<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Gravação Cliente</title>

<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.0/css/bootstrap.min.css">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

</head>

<body>
	<h1 class="bg-dark text-white text-center p-5">Gravação de cliente
		e telefone</h1>

	<div class="col-md-6 offset-md-3 mt-5">
		<div class="card">
			<div class="card-body">

				<form
					action="http://localhost:8083/projetoAulaQuatro/ClienteController?cmd=gravar"
					method="post" class="form">

					<label><i class="fas fa-user"></i> Nome:</label> <input
						class="form-control" type="text" name="nome"
						placeholder="Digite o nome completo"> <label class="mt-3"><i
						class="fas fa-envelope"></i> Email:</label> <input class="form-control"
						type="email" name="email" placeholder="Digite o email"> <label
						class="mt-3"><i class="fas fa-lock"></i> Senha:</label> <input
						class="form-control" type="password" name="senha"
						placeholder="Digite a senha"> <label class="mt-3"><i
						class="fas fa-phone"></i> Telefone:</label> <input class="form-control"
						type="text" name="numero" placeholder="Digite apenas numeros">


					<button class="btn btn-success mt-3" type="submit">
						Gravar <i class="far fa-save"></i>
					</button>
				</form>

			</div>


		</div>


	</div>
	
	
	<div class="col-md-6 offset-md-3 mt-5">
		<div class="card">
			<div class="card-body">

				<form
					action="http://localhost:8083/projetoAulaQuatro/ClienteController"
					method="get" class="form">

					<label><i class="fas fa-user"></i> ID Cliente:</label> <input
						class="form-control" type="number" name="id" placeholder="Digite o ID">



					<button class="btn btn-success mt-3" type="submit">
						Consultar <i class="far fa-save"></i>
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
					<th>Data de Criação</th>
					<th>Telefone</th>
					<th>Ações</th>
				</tr>
			</thead>

			<tbody class="text-center">
				<tr>
					<td>1</td>
					<td>André</td>
					<td>andre@gmail.com</td>
					<td>06/08/2021</td>
					<td>912345678</td>
					<td><a href="#" class="btn btn-info"
						title="Clique para Editar"><i class="fas fa-user-edit"></i></a> <a
						href="#" class="btn btn-danger" title="Clique para Apagar"><i
							class="fas fa-trash-alt"></i></a></td>
				</tr>

				<tr>
					<td>2</td>
					<td>Ana</td>
					<td>ana@gmail.com</td>
					<td>02/08/2021</td>
					<td>912785678</td>
					<td><a href="#" class="btn btn-info"
						title="Clique para Editar"><i class="fas fa-user-edit"></i></a> <a
						href="#" class="btn btn-danger" title="Clique para Apagar"><i
							class="fas fa-trash-alt"></i></a></td>
				</tr>


			</tbody>

		</table>

	</div>



</body>
</html>