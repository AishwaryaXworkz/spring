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
<nav class="navbar navbar-expand-lg bg-info">
 <img src="https://media.licdn.com/dms/image/C5603AQGL7rxUiQ9niQ/profile-displayphoto-shrink_400_400/0/1517597230869?e=1703721600&v=beta&t=fJrWhRFNeG5jEBpYjMCg5LAeORBrtZoIyGTz4Gnuy6Q" alt="Bootstrap" width="50" height="50">
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
        
      
    
      </ul>
      </div>
    </div>
     </nav>
 <div>
 
    <div class="container w-50 border border-dark border-5 mt-5">
    <!-- <div class="mb-3">
				<label class="form-label">Id</label> <input type="number"
					class="form-control" placeholder=" " name="id">
			</div> -->


			<div class="mb-3">
				<label class="form-label">userName</label> <input type="text"
					class="form-control" placeholder=" " name="userName" required="required">
			</div>


			<div class="mb-3">
				<label class="form-label">phoneNumber</label> <input type="number"
					class="form-control" placeholder=" " name="phoneNumber" required="required">
			</div>
			<div class="mb-3">
				<label class="form-label">email</label> <input type="text"
					class="form-control" placeholder=" " name="email" required="required">
			</div>

       <div class="mb-3">
				<label class="form-label">productName</label> <input type="text"
					class="form-control" placeholder=" " name="productName" required="required">
			</div>

      
      <div class="mb-3">
				<label class="form-label">price</label> <input type="tel"
					class="form-control" placeholder=" " name="price" required="required">
			</div>
      
      <div class="mb-3">
				<label class="form-label">address</label> <input type="text"
					class="form-control" placeholder=" " name="address" required="required">
			</div>
      
      <div class="mb-3">
				<label class="form-label">features</label> <input type="text"
					class="form-control" placeholder=" " name="features" required="required">
			</div>
      
      <div class="mb-3">
				<label class="form-label">discount</label> <input type="text"
					class="form-control" placeholder=" " name="discount" required="required">
			</div>
      
      <div class="mb-3">
				<label class="form-label">chat</label> <input type="text"
					class="form-control" placeholder=" " name="chat" required="required">
			</div>
			 <div class="mb-3">
				<label class="form-label">Password</label> <input type="password"
					class="form-control" placeholder=" " name="password" required="required">
			</div>
			 <div class="mb-3">
				<label class="form-label">ConfirmPassword</label> <input type="password"
					class="form-control" placeholder=" " name="confirmPassword" required="required">
			</div>
             <a href="success.jsp"></a>
             
			<input type="submit" class="btn btn-success">
			<input type="reset" class="btn btn-secondary">
			
		</form>	
			
			</div>
	
 </div>

<%@include file="footer.jsp" %>
    
</body>
	

</html>