<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>

<title>Siscomex - Sistema de Parametrizacao</title>
<title>Menu</title>
<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/style.css' />" rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />

</head>
<body>

	<%@ include file="/WEB-INF/views/shared/header.jsp"%>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="text-center">
					<p>Arquivo testado:
					<h3>${fileName}</h3>
					</p>
					${fileText} <br />
				</div>
			</div>
		</div>
		<c:if test="${result == 1}">
			<div class="row">
				<div class="col-md-12">

					<div class="row">
						<div class="col-md-4">
							<br></br> <br></br>
						</div>
						<div class="col-md-4">
							<div class="row">
								<div class="col-md-6">
									<img src="<c:url value='/static/images/iconGreen.png' />">
								</div>
								<div class="col-md-6">
									<dl>
										<dt>Produto liberado</dt>

										<dd>Envio a caminho</dd>

									</dl>
									<br></br>
								</div>
							</div>
						</div>
						<div class="col-md-4"></div>
					</div>
		</c:if>
		<c:if test="${result == 2}">
			<div class="row">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<div class="row">
						<div class="col-md-6">
							<img src="<c:url value='/static/images/iconYellow.png' />">
						</div>
						<div class="col-md-6">
							<dl>
								<dt>Produto bloqueado</dt>
								<dd>Aguardando analise para liberação</dd>

							</dl>
							<br></br>
						</div>
					</div>
				</div>
				<div class="col-md-4"></div>
			</div>
		</c:if>
		<c:if test="${result == 3}">
			<div class="row">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<div class="row">
						<div class="col-md-6">
							<img src="<c:url value='/static/images/iconRed.png' />">
						</div>
						<div class="col-md-6">
							<dl>
								<dt>Produto bloqueado</dt>
								<dd>Sem previsao para liberar</dd>

							</dl>
							<br></br>
						</div>
					</div>
				</div>
				<div class="col-md-4"></div>
			</div>
		</c:if>
		<c:if test="${result == 4}">
			<div class="row">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<div class="row">
						<div class="col-md-6">
							<img src="<c:url value='/static/images/iconGrey.png' />">
						</div>
						<div class="col-md-6">
							<dl>
								<dt>Produto bloquado</dt>
								<dd>Breve prazo para liberação</dd>

							</dl>
							<br></br>
						</div>
					</div>
				</div>
				<div class="col-md-4"></div>
			</div>
		</c:if>
	</div>

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/scripts.js"></script>
</body>
</html>