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
	<div class="container w-50 border border-dark border-5 mt-5">

		<form action="save" method="post">
			
			<div class="mb-3">
				<label class="form-label">Id</label> <input type="number"
					class="form-control" placeholder=" " name="id">
			</div>


			<div class="mb-3">
				<label class="form-label">userName</label> <input type="text"
					class="form-control" placeholder=" " name="userName">
			</div>


			<div class="mb-3">
				<label class="form-label">phoneNumber</label> <input type="number"
					class="form-control" placeholder=" " name="phoneNumber">
			</div>
			<div class="mb-3">
				<label class="form-label">email</label> <input type="text"
					class="form-control" placeholder=" " name="email">
			</div>

       <div class="mb-3">
				<label class="form-label">productName</label> <input type="text"
					class="form-control" placeholder=" " name="productName">
			</div>

      
      <div class="mb-3">
				<label class="form-label">price</label> <input type="tel"
					class="form-control" placeholder=" " name="price">
			</div>
      
      <div class="mb-3">
				<label class="form-label">address</label> <input type="text"
					class="form-control" placeholder=" " name="address">
			</div>
      
      <div class="mb-3">
				<label class="form-label">features</label> <input type="text"
					class="form-control" placeholder=" " name="features">
			</div>
      
      <div class="mb-3">
				<label class="form-label">discount</label> <input type="text"
					class="form-control" placeholder=" " name="discount">
			</div>
      
      <div class="mb-3">
				<label class="form-label">chat</label> <input type="text"
					class="form-control" placeholder=" " name="chat">
			</div>
      
			<input type="submit" class="btn btn-success">
			</form>
	</div>
	

</body>
	

</html>