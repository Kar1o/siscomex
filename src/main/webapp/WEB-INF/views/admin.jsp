<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Admin page</title>
		<link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet"></link>
		<link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
	</head>

	<body>

		<div class="form-group">
			<div class="body">
				<div class="container">
					<fieldset>
						<form:form role="form" action="${contextPath}/users/all" method="post" commandName="user">
						
							<div class="row">
								<div class="form-group col-lg-4">
									<label for="code"> ID: </label>
									<form:input path="userId" type="text" name="userId" id="userId" required="true" readonly="true" class="form-control" />
								</div>
							</div>

							<div class="row">
								<div class="form-group col-lg-4">
									<label for="code"> Senha: </label>
									<form:input path="firstName" type="text" name="firstName" id="firstName" required="true" class="form-control" />
								</div>
							</div>

							<div class="row">
								<div class="form-group col-lg-4">
									<label for="code">Nome:</label>
									<form:input path="lastName" type="text" name="lastName" id="lastName" required="true" class="form-control" />
								</div>
							</div>

							<div class="row">
								<div class="form-group col-lg-4">
									<label for="code"> Sobrenome: </label>
									<form:input path="role" type="text" name="role" id="role" required="true" class="form-control" />
								</div>
							</div>

							<div class="row">
								<div class="form-group col-lg-4">
									<label for="code"> Email:</label>
									<form:input path="email" type="text" name="email" id="email" required="true" class="form-control" />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-lg-4">
									<label for="code"> Estado: </label>
									<form:input path="createdBy" type="text" name="createdBy" id="createdBy" required="true" class="form-control" />
								</div>
							</div>

							
							</div>

							<input type="submit" class="btn btn-success" value="Comfirm">
							<a href="${contextPath}/users/all" class="btn btn-danger" role="button">Cancel</a>

						</form:form>
					</fieldset>
				</div>
			</div>
		</div>

</body>