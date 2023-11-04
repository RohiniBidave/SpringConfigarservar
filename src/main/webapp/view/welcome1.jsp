<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>USER REG FORM</h1>

	<form action="/saveStudent">
		<table>
			<tr>
				<td>USERNAME FNAME</td>
				<td><input type="text" name="fname"></td>
			</tr>

			<tr>
				<td>USERNAME LASTNAME</td>
				<td><input type="text" name="lname"></td>
			</tr>

			<tr>
				<td>ADDRESS</td>
				<td><input type="text" name="saddress"></td>
			</tr>

			<tr>
				<td>MARKS</td>
				<td><input type="text" name="smarks"></td>
			</tr>

			<tr>

				<td><input type="submit" value="REGISTER"></td>
			</tr>
		</table>
	</form>
</body>
</html>