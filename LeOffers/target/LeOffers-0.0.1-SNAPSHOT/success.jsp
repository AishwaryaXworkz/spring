<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LeOffers</title>


</head>
<body>
<h1 style="text-align:center;">LeOffers Info</h1>	

<table border="10" align="center">
<tr>
<th >Id</th>
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
<td>${Dto.id}</td>
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
</div>
</body>
</html>