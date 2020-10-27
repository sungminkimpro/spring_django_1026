<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>contentList</title>
</head>
<body>
<c:forEach var="c" items="${wlist }">
<p>
<span>${c.writer }</span>
</p>
</c:forEach>
</body>
</html>