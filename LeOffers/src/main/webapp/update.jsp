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
<h1>${updatedmessage}</h1>
<form action="update" method="post">
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
          <a class="nav-link active" aria-current="page" href="register.jsp">Registration</a>
        </li>
        
      
    
      </ul>
      </div>
    </div>
     </nav>
 <div>
    <div class="container w-50 border border-dark border-5 mt-5">
     <div class="mb-3">
				<label class="form-label">Id</label> <input type="number"
					class="form-control" placeholder=" " name="id" readonly value="${dto.id}">
			</div> 


			<div class="mb-3">
				<label class="form-label">userName</label> <input type="text"
					class="form-control" placeholder=" " name="userName" value="${dto.userName}">
			</div>


			<div class="mb-3">
				<label class="form-label">phoneNumber</label> <input type="number"
					class="form-control" placeholder=" " name="phoneNumber" value="${dto.phoneNumber}">
			</div>
			<div class="mb-3">
				<label class="form-label">email</label> <input type="text"
					class="form-control" placeholder=" " name="email" value="${dto.email}">
			</div>

       <div class="mb-3">
				<label class="form-label">productName</label> <input type="text"
					class="form-control" placeholder=" " name="productName" value="${dto.productName}">
			</div>

      
      <div class="mb-3">
				<label class="form-label">price</label> <input type="tel"
					class="form-control" placeholder=" " name="price" value="${dto.price}">
			</div>
      
      <div class="mb-3">
				<label class="form-label">address</label> <input type="text"
					class="form-control" placeholder=" " name="address" value="${dto.address}">
			</div>
      
      <div class="mb-3">
				<label class="form-label">features</label> <input type="text"
					class="form-control" placeholder=" " name="features" value="${dto.features}">
			</div>
      
      <div class="mb-3">
				<label class="form-label">discount</label> <input type="text"
					class="form-control" placeholder=" " name="discount" value="${dto.discount}">
			</div>
      
      <div class="mb-3">
				<label class="form-label">chat</label> <input type="text"
					class="form-control" placeholder=" " name="chat" value="${dto.chat}">
			</div>
            
             
			<input type="submit"  value="update" class="btn btn-success">
			<input type="reset" class="btn btn-secondary">
			
		</form>	
			
			</div>
	
 </div>


    
</body>
	

</html>