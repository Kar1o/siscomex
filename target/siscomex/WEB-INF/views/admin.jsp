<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<title>Admin page</title>
<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
	<link href="<c:url value='/static/css/style.css' />"  rel="stylesheet" />
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
</head>
<script>
	$(function() {
		$("#datepicker1").datepicker();
	});
	$(function() {
		$("#datepicker2").datepicker();
	});
</script>
<body>

	<%@ include file="/WEB-INF/views/shared/header.jsp"%>

	<div class="form-group">
		<div class="container">
			<form:form role="form" action="/SpringSecurityHibernate/mudaValor"
				method="post" commandName="xml">

				<div class="row">
					<div class="col-md-12">
						<label for="code"> Usuario: </label>
						<form:input path="userName" value="${name}" required="true"
							readonly="true" class="form-control" />
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<label for="code"> Valor da mercadoria: </label>
						<form:input path="valorMercadoria" required="true"
							class="form-control" />
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<label for="code">Peso bruto:</label>
						<form:input path="pesoBruto" required="true" class="form-control" />
					</div>
				</div>

				<div class="row">
					<div class="col-md-12">
						<label for="code"> Peso liquido: </label>
						<form:input path="pesoLiquido" required="true"
							class="form-control" />
					</div>
				</div>

				<div class="row">
					<div class="col-md-12">
						<label for="code"> Data embarque:</label>
						<form:input path="dataEmbarque" required="true"
							class="form-control" type="text" id="datepicker1" />
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<label for="code"> Data chegada: </label>
						<form:input path="dataChegada" required="true"
							class="form-control" type="text" id="datepicker2" />
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<label for="code"> Local origem: </label>
						<form:input path="localOrigem" required="true"
							class="form-control" />
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<label for="code"> Local destino: </label>
						<form:input path="localDestino" required="true"
							class="form-control" />
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<label for="code"> Empresa origem: </label>
						<form:input path="empresaOrigem" type="text" name="createdBy"
							id="createdBy" required="true" class="form-control" />
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<label for="code"> Empresa destino: </label>
						<form:input path="empresaDestino" type="text" name="createdBy"
							id="createdBy" required="true" class="form-control" />
					</div>
				</div>
				<br />
				<div class="row">
					<div class="col-md-12">
						<input type="submit" class="btn btn-success" value="Comfirmar">
						<a href="<c:url value="/menu" />" class="btn btn-danger"
							role="button">Cancelar</a>
					</div>
				</div>

			</form:form>
		</div>
		<%@ include file="/WEB-INF/views/shared/logout.jsp" %>
	</div>

</body>