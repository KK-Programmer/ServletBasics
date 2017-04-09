<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Details</title>
</head>
<body>
	<form action="getReservationEventBasedOnId" method="post">
		<table>
			<tr>
				<td>ReservationId:</td>
				<td><input type="text" name="resId"></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="GetReservationEventData"></td>
				<td></td> 
			</tr>
		</table>
	</form>

</body>
</html>