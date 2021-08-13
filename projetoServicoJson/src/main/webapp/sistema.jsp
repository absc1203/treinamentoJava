<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Gravar Usuário</h2>

<form method="post" action="UsuarioController">
Nome: <br>
<input type="text" name="nome" value=""><br>
email: <br>
<input type="text" name="email" value=""><br>
senha: <br>
<input type="password" name="senha" value=""> 
<input type="hidden" name="flag" value="gravar"> 
<br>
<br>
<input type="submit" value="Gravar">

</form>
<br>
${msg}
<br>
<h2>Logar usuario</h2>

<form method="post" action="UsuarioController">

email: <br>
<input type="text" name="nome" value=""><br>
senha: <br>
<input type="password" name="nome" value=""><br>
<br>

<input type="submit" value="gravar"><br>
<input type="hidden" name="flag" value="logar"> 

</form>




</body>
</html>