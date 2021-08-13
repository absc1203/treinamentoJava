<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.0/css/bootstrap.min.css">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
	
<link rel="stylesheet" href="style.css">
</head>


<body>

	<div class="container">
		<div class="d-flex justify-content-center h-100">
			<div class="card">
				<div class="card-header">
					<h3 class="text-white to-uppercase">Login</h3>
					<div class="d-flex justify-content-end social_icon">
						<span><i class="fab fa-facebook-square"></i></span> <span><i
							class="fab fa-google-plus-square"></i></span> <span><i
							class="fab fa-twitter-square"></i></span>

					</div>


				</div>

				<div class="card-body">
					<form method="post" action="#" class="form">
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" name="email" placeholder="Digite o email"
								class="form-control">
						</div>

						<div class="input-group form-group mt-3">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" name="senha" placeholder="Digite a senha"
								class="form-control">
						</div>

						<div class="row align-items-center remember">
							<input type="checkbox">Lembrar-me
						</div>
						
						<div class="form-group mt-3">
							<input type="submit" value="LOGAR" class="btn float-right login_btn">
						</div>

					</form>
				</div>
				
				
				<div class="card-footer">
					<div class="d-flex justify-content-center links">
						Não tem conta? <a href="#">Clique aqui</a>
					</div>
					
					<div class="d-flex justify-content-center">
						<a href="#">Esqueceu a senha?</a>
					</div>
					
					
				</div>


			</div>

		</div>

	</div>

</body>

<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.0/js/bootstrap.min.js"></script>
</html>