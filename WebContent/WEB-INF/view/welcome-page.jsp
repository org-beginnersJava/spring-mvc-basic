<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="processOrder">
		<h2 align="center">${myWelcomePage}</h2>
		<div align="center">

			<hr>
			<label for="item_name">ITEM NAME : </label> <input id="item_name"
				name="foodtype" type="text" placeholder="food_type??"> <input
				type="submit" value="order_now">
		</div>
	</form>
</body>
</html>