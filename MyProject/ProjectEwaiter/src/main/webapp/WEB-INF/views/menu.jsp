<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu Page</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
</head>
<body>
<%
if(session.getAttribute("loggedCustId")==null)
	response.sendRedirect("/");
%>
	<div class="container-flud  ">

		<div class="row bg-dark pt-3">
			<div class="col-1 "></div>
			<div class="col-10  text-light ">
					<h1>RESTAURANT 15</h1>
			</div>
			<div class="col-1 txt-light pt-3">
				<a href="/logout"class="btn btn-danger border-light" role="button">logout</a>
			</div>
		</div>

		<div class="row bg-light">
			<div class="col-2"></div>
			<div class="col-8" align="center">
				<h4>Choose Menu</h4>
				
			</div>
		</div>
		<div class="col-2"></div>
	</div>

	<div class="row ">
		<div class="col-1 "></div>
		<div class="col-11 text-dark ">
			<footer>&copy; Copyright 2020 CDAC</footer>
		</div>
	</div>
</body>
</html>