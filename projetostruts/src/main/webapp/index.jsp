<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>

<%@ taglib uri="/struts-tags" prefix="s"%>
</head>
<body>

<h1>Cadastro de Pessoa</h1>
<hr>
<h3>Preencha os dados da pessoa</h3>
<br>

<s:form id="form1" action="pessoa.cadastrar" method="post">

	<s:textfield name="pessoa.nome" id="nome" label="Digite o nome da pessoa" required="true"></s:textfield>
	<s:textfield name="pessoa.idade" id="idade" label="Digite a idade" required="true"></s:textfield>
	
	<s:submit value="Enviar"></s:submit>

</s:form>

<br>

<s:form id="form1" action="pessoa.gravar" method="post">

	<s:textfield name="pessoa.nome" id="nome" label="Digite o nome da pessoa" required="true"></s:textfield>
	<s:textfield name="pessoa.idade" id="idade" label="Digite a idade" required="true"></s:textfield>
	
	<s:submit value="Gravar"></s:submit>

</s:form>


</body>
</html>