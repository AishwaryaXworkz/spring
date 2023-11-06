<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FindAll</title>
<%@include file="navfind.jsp" %>
</head>
<body>
<form action="findAll" method="get">


    

<br>
<br>

<input type="submit" text-align="center">
<br>
<br>

<h1 style="text-align:center;">LeOffers Info</h1>


<table class="table table-bordered"  align="center">


<tr>
<th>id</th>
<th>UserName</th>
<th>PhoneNumber</th>
<th>Email</th>
<th>ProductName</th>
<th>Price</th>
<th>Address</th>
<th>Features</th>
<th>Discount</th>
<th>chat</th>
<th>Action</th>
</tr> 

<c:forEach items="${dtos}" var="Dto">
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
<td><a href="update?id=${Dto.id}" class="btn btn-sm btn-primary">Update</a> 
<a href="delete/${Dto.id}" class="btn btn-sm btn-danger m-1">Delete</a></td>
</tr>
</c:forEach>
</table>


</form>
<div>
<h2>${success}</h2>
<h2>${fail}</h2>
<h2>${update}</h2>
</div>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<%@include file="footer1.jsp" %>
</body>
</html>