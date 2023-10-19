<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RTO</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">

</head>
<body>
<form action="save" method="post">
<nav class="navbar navbar-expand-lg bg-info">
 <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQE_8KMvgjD-gk2gbjB_5qRCQyivcQikWHZVg&usqp=CAU" alt="Bootstrap" width="100" height="50">
 
  <div class="container-fluid">
  
  <svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-house-door-fill" viewBox="0 0 16 16">
  <path d="M6.5 14.5v-3.505c0-.245.25-.495.5-.495h2c.25 0 .5.25.5.5v3.5a.5.5 0 0 0 .5.5h4a.5.5 0 0 0 .5-.5v-7a.5.5 0 0 0-.146-.354L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293L8.354 1.146a.5.5 0 0 0-.708 0l-6 6A.5.5 0 0 0 1.5 7.5v7a.5.5 0 0 0 .5.5h4a.5.5 0 0 0 .5-.5Z"/>
</svg>
    <a class="navbar-brand" href="index.jsp">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
        </li>
        </ul>
        </div>
      
     
        
       
        <a class="btn btn-primary" href="signin.jsp" role="button" class="me-3">SignIn</a>
        </nav>

 
    <div class="container w-50 border border-dark border-5 mt-5">
    <div class="mb-3">
				<label class="form-label">FirstName</label> <input type="text"
					class="form-control" placeholder=" " name="firstName">
			</div> 

<div class="mb-3">
				<label class="form-label">LastName</label> <input type="text"
					class="form-control" placeholder=" " name="lastName">
			</div>

 <div class="mb-3">
				<label class="form-label">password</label> <input type="password"
					class="form-control" placeholder=" " name="password">
			</div>

      
      <div class="mb-3">
				<label class="form-label">confirmPassword</label> <input type="password"
					class="form-control" placeholder=" " name="confirmPassword">
			</div>
      
      <div class="mb-3">
				<label class="form-label">dob</label> <input type="date"
					class="form-control" placeholder=" " name="dob">
			</div>
      
			<div class="mb-3">
				<label class="form-label">phoneNumber</label> <input type="number"
					class="form-control" placeholder=" " name="phoneNumber">
			</div>
			<div class="mb-3">
				<label class="form-label">email</label> <input type="text"
					class="form-control" placeholder=" " name="email">
				<font color="RED" size=6><h6>${err}</h6></font>	
			</div>

            <input type="submit" class="btn btn-success">
			<input type="reset" class="btn btn-secondary">
			
		</form>	
			
			</div>
	
 </div>


    <%@include file="footer.jsp" %>
</body>
	

</html>