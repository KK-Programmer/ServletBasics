<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
	<table border="1">
		<thead>
			<tr>ReservationId</tr>
			<tr>PnrNumber</tr>
			<tr>SubType</tr>
		</thead>
		<tr>
			<td>${re.reservationId}</td>
			<td>${re.pnrNumber}</td>
			<td>${re.subType}</td>
		</tr>
		
	</table>
</form>

</body>
</html>