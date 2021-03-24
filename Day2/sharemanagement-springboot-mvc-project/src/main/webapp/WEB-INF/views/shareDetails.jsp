<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

		<tr>
			<td>${share.instrumentId }</td>
			<td>${share.instrumentName }</td>
			<td>${share.marketRate }</td>
		</tr>


</table>

</body>
</html>