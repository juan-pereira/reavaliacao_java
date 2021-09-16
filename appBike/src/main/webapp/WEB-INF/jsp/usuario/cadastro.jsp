<%@ page language="java" contentType="text/html; charset = ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html lang="Pt-br">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <title>App Bike - Home Page</title>
</head>
<body>
<div class="container">
		<h1>Cadastro de Usuários</h1>
	    <form action="/usuario/incluir" method="post">
	    
			<div class="form-group">
			  	<label>Nome:</label>
			  	<input type="text" class="form-control" name="nome" value="Juan Pablo">
			</div>
			<div class="form-group">
			  	<label>E-mail:</label>
			  	<input type="email" class="form-control" name="email" value="juan.pereira@al.infnet.edu.br">
			</div>
			<div class="form-group">
			  	<label>Senha:</label>
			  	<input type="password" class="form-control" name="senha" value="123">
			</div>
	    	<br><br>
	    	
	    	<button type = "submit">Cadastro</button>
    	</form>

		<c:if test="${not empty usuarios}">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Nome</th>
					<th>E-mail</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="u" items="${usuarios}">
				<tr>
					<td>${u.id}</td>
					<td>${u.nome}</td>
					<td>${u.email}</td>
					<td><a href="/usuario/${u.id}/excluir">Excluir</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		</c:if>
		
		<c:if test="${empty usuarios}">
		<h3>Não existem usuários a serem mostrados</h3>
		</c:if>
	</div> 
</body>
</html>