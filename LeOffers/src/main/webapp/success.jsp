<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LeOffers</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</head>
<body>
	<form action="save" method="post">
		
		<h1 style="text-align: center;">LeOffers Info</h1>
		<table class="table table-bordered"  align="center">
			<tr>

				<th>UserName</th>
				<th>PhoneNumber</th>
				<th>Email</th>
				<th>ProductName</th>
				<th>Price</th>
				<th>Address</th>
				<th>Features</th>
				<th>Discount</th>
				<th>chat</th>
			</tr>
			<tr>

				<td>${Dto.userName}</td>
				<td>${Dto.phoneNumber}</td>
				<td>${Dto.email}</td>
				<td>${Dto.productName}</td>
				<td>${Dto.price}</td>
				<td>${Dto.address}</td>
				<td>${Dto.features}</td>
				<td>${Dto.discount}</td>
				<td>${Dto.chat}</td>
			</tr>
		</table>
		<div class="text-center">
		<a href="register.jsp"> Back</a>
		
		</div>
	</form>
</body>
</html>