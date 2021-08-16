<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Registrar</title>
<style type="text/css">
.button-register {background-color: green;color: white;}
.button-report {background-color: #000000;color: white;margin-left: 30%;}
</style>
</head>
<body>
	<a href="report"><button class="button-report" type="button">Consulta</button></a>
	<s:form action="registeruser.action" method="post">
		<s:textfield label="Nome completo" name="" />
		<s:textfield label="Email" name="" />
		<s:password label="Senha" name="" />
		<s:submit cssClass="button-register" value="Registrar" />
	</s:form>
	<s:if test="ctr>0">
		<span style="color: green;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
</body>
</html>