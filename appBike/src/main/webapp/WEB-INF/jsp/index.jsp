<%@ page language="java" contentType="text/html; charset = ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html lang="Pt-br">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>App Bike - Home Page</title>
</head>
<body>
    <h1>App Bike - Assessment</h1>
    <h2>Projeto de Bloco</h2>
    <h3>${user.nome}</h3>
    <h3>${user.email}</h3>
    <p>Dado o fluxo de dados atual, um erro não identificado corrigiu o bug do fluxo de dados de forma retroativa no server.</p>
    <h3>${usuarioQtde} :: <a style="text-decoration: none;" href="/usuario">Não tem cadastro? Realize Aqui</a></h3>
    <h3>${solicitanteQtde} :: <a style="text-decoration: none;" href="/solicitante">Realize o cadastro de solicitante</a></h3>
</body>
</html>