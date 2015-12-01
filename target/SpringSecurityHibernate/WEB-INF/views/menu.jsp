<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Menu</title>
		<link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet"></link>
		<link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
	</head>

	<body>


 <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<h3 class="text-center">
				Siscomex - Sistema de Parametrização
			</h3>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<div class="row">
				<div class="col-md-4">
				</div>
				<div class="col-md-4">
					<div class="row">
						<div class="col-md-12">
							 <br></br>
							 <br></br>
							 <br></br>
							 <br></br>
							 <br></br>

							 <a href="<c:url value="/importar" />">
							<button type="button" class="btn btn-primary">
								Importar XML
							</button>
							</a>
							<br></br>
							<br></br>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">

							<a href="<c:url value="/admin" />">
							<button type="button" class="btn btn-primary">
								Parametrização
							</button>
							</a>
						</div>
					</div>
				</div>
				<div class="col-md-4">
				</div>
			</div>
		</div>
	</div>
</div>


	<!--<div class="form-group">
			<div class="body">
				<div class="container">
					<form:form role="form" action="" method="post" commandName="choice">

					<div class="row">
								<div class="form-group col-lg-4">
                                    <button for="import"> <a href="resultado.jsp">XML</a> </button>
								</div>
					</div>
					<div class="row">
								<div class="form-group col-lg-4">
                                    <button for="result"> Resultado </button>
								</div>
					</div>
					<div class="row">
								<div class="form-group col-lg-4">
                                    <button for="admin"> Admin </button>
								</div>
					</div>
					</form>
				</div>
			</div>-->

    <!--<script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>-->
  </body>
</html>
