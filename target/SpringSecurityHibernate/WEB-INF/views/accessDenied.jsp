<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet" />
	<title>AccessDenied page</title>
</head>
<body>

<div class="container-fluid">
    <%@ include file="/WEB-INF/views/shared/header.jsp" %>

	<br />
	<strong>${user}</strong>, Voce não tem autorizaçao para acessar essa pagina!
	<a href="<c:url value="/logout" />">Logout</a>
</div>
</body>
</html>