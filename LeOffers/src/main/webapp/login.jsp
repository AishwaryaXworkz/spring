<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sign in</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">

</head>
<body>
	<nav class="navbar navbar-expand-lg bg-info">
		<img
			src="https://media.licdn.com/dms/image/C5603AQGL7rxUiQ9niQ/profile-displayphoto-shrink_400_400/0/1517597230869?e=1703721600&v=beta&t=fJrWhRFNeG5jEBpYjMCg5LAeORBrtZoIyGTz4Gnuy6Q"
			alt="Bootstrap" width="100" height="50">
 

		<div class="container-fluid">


			<a class="navbar-brand" href="index.jsp">Home</a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"></li>
				</ul>


				<a class="btn btn-primary" href="register.jsp" role="button">registration</a>

			</div>
		</div>
	</nav>
	<div class="container w-50 border border-dark border-5 mt-5">
	<h5 style='color:green'>${success}</h5>
		<h6 style='color:red'>${err}</h6>
		<form action="signin" method="get">

			<div class="mb-3">
				<label class="form-label">Email</label> <input type="text"
					name="email" class="form-control" required="required">
			</div>

			<div class="mb-3">
				<label class="form-label">Password</label> <input type="password"
					name="password" class="form-control" required="required">
			</div>

			<input type="submit" type="button" class="btn btn-success">
		</form>
	</div>

</body>
<br>
<br>
<br>
<br>
<br>
<br>

<%@include file="footer1.jsp"%>
</html>