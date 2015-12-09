<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<<<<<<< HEAD
<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet" />
<title>AccessDenied page</title>
</head>
<body>

	<div class="container-fluid">
		<%@ include file="/WEB-INF/views/shared/header.jsp"%>
		<div class="text-center">
			<br /> <strong>${user}</strong>, Voce não tem autorizaçao para
			acessar essa pagina! <a href="<c:url value="/logout" />">Logout</a>
		</div>
	</div>
=======
	<link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet" />
	<title>AccessDenied page</title>
</head>
<body>

<div class="container-fluid">
    <%@ include file="/WEB-INF/views/shared/header.jsp" %>

	Dear <strong>${user}</strong>, You are not authorized to access this page
	<a href="<c:url value="/logout" />">Logout</a>
</div>
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
</body>
</html>