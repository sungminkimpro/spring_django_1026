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
<c:forEach var="m" items="${mlist}">
<p>
<span>${m.id }</span>
<span>${m.name }</span>
<span>${m.tel }</span>
<span>${m.emain }</span>
<span>${m.addr }</span>
</p>
</c:forEach>
</body>
</html>