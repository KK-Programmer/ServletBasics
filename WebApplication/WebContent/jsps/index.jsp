<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index Page</title>
</head>
<body>
<h3>${insertMessage}</h3>
	<form action="register" method="post">
		<table>
			<tr>
				<td>ReservationId:</td>
				<td><input type="text" name="resId"></td>
				<td></td>
			</tr>
			<tr>
				<td>PnrNumber:</td>
				<td><input type="text" name="pnrNumber"></td>
				<td></td>
			</tr>
			<tr>
				<td>SubType:</td>
				<td><input type="text" name="subType"></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="REGISTER"></td>
				<td></td>
			</tr>
			<tr>
				<td>Click the Below Link to get the Details Based ID:</td>
				<td> <a href="getReservationEventBasedOnId">GetDataBasedOnReservationID</a><td>
			</tr>
		</table>
	</form>
</body>
</html>