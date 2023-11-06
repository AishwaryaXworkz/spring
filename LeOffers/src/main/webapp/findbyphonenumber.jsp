<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LeOffers</title>

</head>
<body>
<%@include file="navfind.jsp" %>
<form action="findbyphonenumber" method="get">

        <br>
        <br>
        <br>
<input  type="search" placeholder="Search" aria-label="Search" name="phoneNumber">
 <button class="btn btn-outline-success" type="submit">Submit</button>
<h1 style="text-align:center;">LeOffers Info</h1>
<table class="table table-bordered">
<tr>
<!-- <th>id</th> -->
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
<c:forEach items="${dtos}" var="Dto">
<tr>
<%-- <td>${Dto.id}</td> --%>
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
</c:forEach>
</table>
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
</form>
</body>
</html>