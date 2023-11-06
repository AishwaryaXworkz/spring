<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>profile</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg bg-info">
		<img src="https://media.licdn.com/dms/image/C5603AQGL7rxUiQ9niQ/profile-displayphoto-shrink_400_400/0/1517597230869?e=1703721600&v=beta&t=fJrWhRFNeG5jEBpYjMCg5LAeORBrtZoIyGTz4Gnuy6Q"
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



				<div class="d-flex">
					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="navbar-nav me-auto mb-2 mb-lg-0">
							<li class="nav-item"><a class="nav-link" role="button"
								name="firstName" href=""><b>Hi,${Dto.userName}
										</b><b>${Dto.registeredDateTime}</b></a></li>
						</ul>

						<ul class="navbar-nav me-auto mb-2 mb-lg-0">
							<li class="nav-item"><a class="nav-link" role="button"
								href="index.jsp"><b>Logout</b></a></li>
						</ul>
					</div>
				</div>
			</div>
	</nav>

	<div>
		<%-- <h1 class="text-center">Leoffers info</h1>
		<table class="table table-bordered pd-5">

			<tr>
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
			


		</table> --%>
	</div>
	
</body>
</html>