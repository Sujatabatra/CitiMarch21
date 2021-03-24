<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Share Details</h1>
<table border="1">
	<tr>
		<th>Share Id</th>
		<th>Share Name</th>
		<th>Market Rate</th>
	</tr>
	<c:forEach items="${shares}" var="share">
		<tr>
			<td>${share.instrumentId }</td>
			<td>${share.instrumentName }</td>
			<td>${share.marketRate }</td>
		</tr>
	</c:forEach>

</table>

<br><br>
<a href="/">Go Back</a>
</body>
</html>