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
<link rel="stylesheet" type="text/css"
	href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />

</head>
<body>

	<%@ include file="/WEB-INF/views/shared/header.jsp"%>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="text-center">
					Arquivo testado: ${fileName}
					<p>Resultado:</p>
					<br />
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
									<img alt="Bootstrap Image Preview"
										src="https://dl.dropboxusercontent.com/u/104995665/Prot%C3%B3tipo/IconGreen.png">
								</div>
								<div class="col-md-6">
									<dl>
										<dt>teste ${fileSize}</dt>

										<dd>vtnc ${fileName}</dd>

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
							<img alt="Bootstrap Image Preview"
								src="https://dl.dropboxusercontent.com/u/104995665/Prot%C3%B3tipo/IconYellow.png">
						</div>
						<div class="col-md-6">
							<dl>
								<dt>Alguma coisa</dt>
								<dd>Alguma descrição</dd>

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
							<img alt="Bootstrap Image Preview"
								src="https://dl.dropboxusercontent.com/u/104995665/Prot%C3%B3tipo/IconRed.png">
						</div>
						<div class="col-md-6">
							<dl>
								<dt>Alguma coisa</dt>
								<dd>Alguma descrição</dd>

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
							<img alt="Bootstrap Image Preview"
								src="https://dl.dropboxusercontent.com/u/104995665/Prot%C3%B3tipo/IconGrey.png">
						</div>
						<div class="col-md-6">
							<dl>
								<dt>Alguma coisa</dt>
								<dd>Alguma descrição</dd>

							</dl>
							<br></br>
						</div>
					</div>
				</div>
				<div class="col-md-4"></div>
			</div>
		</c:if>
	</div>
	</div>
	</div>

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/scripts.js"></script>
</body>
</html>