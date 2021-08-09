<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Busca Cep</title>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">

</head>
<body>

<h1 class="bg-info text-center p-3">Busca Cep Cliente e Endereco <i class="fa fa-search"></i></h1>



<div class="container">

<div class="row">

	<div class="col-md-5">
		<div class="card mt-3">
			<div class="card-header" >
				<h5 class="text-center">Dados Cliente</h5>
			</div>
			<div class="card-body">
				<form class="form" method="post" action="#">
				
				<label for="nome">Nome:</label>
				<input type="text" name="nome" id="nome" placeholder="Digite o Nome" 
					title="Digite o Nome Completo" class="form-control form-control-sm">
				
				<label for="email" class="mt-2">Email:</label>	
				<input type="email" name="email" id="email" placeholder="Digite seu email"
				title="Digite o email cadastrado" class="form-control form-control-sm">
				
				
			</div>
		</div>
	</div>
	
	
	<div class="col-md-5 offset-md-1">
		<div class="card mt-3">
			<div class="card-header" >
				<h5 class="text-center">Dados Endereco</h5>
			</div>
			<div class="card-body">
			
			<label for="cep" class="mt-2">CEP:</label>
				<input type="text" name="cep" id="cep" placeholder="Digite o CEP"
				title="Digite apenas numeros" class="form-control form-control-sm">
				
				<label for="logradouro" class="mt-2">Logradouro: </label>
				<input type="text" name="logradouro" id="logradouro" placeholder="Digite seu endereco"
				title="Digite seu endereco" class="form-control form-control-sm">
				
				<label for="numero" class="mt-2">Número: </label>
				<input type="text" name="numero" id="numero" placeholder="Digite o numero"
				title="Digite o numero" class="form-control form-control-sm">
				
				<label for="complemento" class="mt-2">Complemento: </label>
				<input type="text" name="complemento" id="complemento" placeholder="Digite seu complemento"
				title="Digite seu complemento" class="form-control form-control-sm">
				
				<label for="bairro" class="mt-2">Bairro: </label>
				<input type="text" name="bairro" id="bairro" placeholder="Digite seu bairro"
				title="Digite seu bairro" class="form-control form-control-sm">
				
				<label for="cidade" class="mt-2">Cidade: </label>
				<input type="text" name="cidade" id="cidade" placeholder="Digite sua cidade"
				title="Digite sua cidade" class="form-control form-control-sm">
				
				<label for="estado" class="mt-2">Estado: </label>
				<input type="text" name="estado" id="estado" placeholder="Digite o estado"
				title="Digite o estado" class="form-control form-control-sm">
				
				<div class="d-grid gap-2">
					<button type="submit" class="btn btn-info btn-block mt-3">Gravar</button>
				</div>
				
				</form>
			</div>
		</div>
	</div>
	
	</div>
</div>



</body>

<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" 
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.2/js/bootstrap.min.js"></script>

<script>
	$(document).ready(
		function(){
			$("#cep").blur(
				function(){
					var cep = $(this).val();
					var validacep = /^[0-9]{5}-?[0-9]{3}$/;
					
					if(validacep.test(cep)){
						$("#logradouro").val("...")
						$("#bairro").val("...")
						$("#cidade").val("...")
						$("#estado").val("...")
						$.getJSON("http://viacep.com.br/ws/" + cep + "/json/?callback=?", 
								function(dados){
									if(!("erro" in dados)){
										$("#logradouro").val(dados.logradouro)
										$("#bairro").val(dados.bairro)
										$("#cidade").val(dados.localidade)
										$("#estado").val(dados.uf)
										$("#numero").focus();
									}else{
										alert ("CEP não encontrado");
									}
						});
					} else {
						alert("Formato de CEP invalido");
					}
				});
			});
</script>

</html>