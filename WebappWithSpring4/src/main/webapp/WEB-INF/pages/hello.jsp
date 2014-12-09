<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Inside hello.jsp
<c:out value="${empdetails}"></c:out>
<br>
*********************************************
<br>

<c:out value="${empdetails.eid}"></c:out>
<c:out value="${empdetails.firstname}"></c:out>
<c:out value="${empdetails.lastname}"></c:out>
<c:out value="${empdetails.email}"></c:out>

</body>
</html>