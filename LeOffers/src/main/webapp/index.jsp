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
 <img src="https://media.licdn.com/dms/image/C5603AQGL7rxUiQ9niQ/profile-displayphoto-shrink_400_400/0/1517597230869?e=1703721600&v=beta&t=fJrWhRFNeG5jEBpYjMCg5LAeORBrtZoIyGTz4Gnuy6Q"
  
  alt="Bootstrap" width="50" height="50">
 
 
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="register.jsp">Registration</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="login.jsp">Login</a>
        </li>
         
     
       
     
      </ul>
      <form class="d-flex" role="search"> 
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"  >
          
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
<marquee><h2>WELCOME TO AKV </h2></marquee>

  <div class="container text-center">
  <div class="row">
    <div class="col">
      
    </div>
    <img src="https://www.akvtechnologies.com/assets/img/clients/web-p3.png" alt="Bootstrap" width="800" height="550">
    <div class="col">
     
  
    </div>
    <div class="col">
      
    </div>
  </div>
</div>
<%@include file="footer.jsp" %>

</body>
</html>