<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Inserir XML</title>
</head>
<body>

Select a file to upload: <br />
<form:form <!--action="/SpringSecurityHibernate/upload?${_csrf.parameterName}=${_csrf.token}"-->
    action = "upload" method="post"
                        enctype="multipart/form-data">
<input type="file" name="file" size="50" id="file-id" />
<br />
<input type="submit" value="Upload File" />

</form:form>
</body>
</html>