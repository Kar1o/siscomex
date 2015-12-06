<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
	<title>Inserir XML</title>
	<link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet"></link>
	<link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
</head>
<body>

<div class="container-fluid">

	<%@ include file="/WEB-INF/views/shared/header.jsp" %>

    <div class="row">
        <div class="col-md-12">

                    Select a file to upload: <br />

                    <form:form action="/SpringSecurityHibernate/upload?${_csrf.parameterName}=${_csrf.token}"
                        method="post" enctype="multipart/form-data">
                    <input type="file" name="file" size="50" id="file-id" />
                    <br />
                    <input type="submit" value="Upload File" />
                    </form:form>

        </div>
    </div>

</div>

<!--action="/SpringSecurityHibernate/upload?${_csrf.parameterName}=${_csrf.token}"-->

</body>
</html>