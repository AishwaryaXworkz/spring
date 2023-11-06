<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LeOffers</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" 
 rel="stylesheet" 
 integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
  crossorigin="anonymous">
</head>
<body>


<form action="save" method="post">
<nav class="navbar navbar-expand-lg bg-info">
 <img src="https://images.g2crowd.com/uploads/product/image/large_detail/large_detail_45629ddd6c99c57b5818ddc8f39ea268/leoffer.png" alt="Bootstrap" width="50" height="50">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
      <li class="nav-item">
          <a class="nav-link" href="findall.jsp">FindAll</a>
        </li> 
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="findbyid.jsp">Id</a>
        </li>
       <li class="nav-item">
          <a class="nav-link" href="findbyusername.jsp">UserName</a>
        </li>
       <li class="nav-item">
          <a class="nav-link" href="findbyemail.jsp">Email</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="findbyphonenumber.jsp">PhoneNumber</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="findbyaddress.jsp">Address</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="findbyproductname.jsp">ProductName</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="findbyprice.jsp">Price</a>
        </li>
           </div>
  </div>
</nav>
        
        <div class="container text-center">
  <div class="row">
    <div class="col">
      
    </div>
    <img src="https://images.g2crowd.com/uploads/product/image/large_detail/large_detail_45629ddd6c99c57b5818ddc8f39ea268/leoffer.png" alt="Bootstrap" width="800" height="550">
    <div class="col">
     
  
    </div>
    <div class="col">
      
    </div>
  </div>
</div>
<br>
<br>
<%@include file="footer1.jsp" %>
</body>
</html>