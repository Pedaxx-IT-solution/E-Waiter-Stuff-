<%@page import="com.ewaiter.controller.UserController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@page import="com.ewaiter.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Menu Item</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<%
response.setHeader("Cache-Control", "no-cache,no-store,must-invalidate");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");
if (session.getAttribute("logged") == null) 
  	response.sendRedirect("/user/");
%>
</head>
<body>
	<div class="container-flud  ">
		
		<div class="row bg-dark pt-3">
				<div class="col-1 "></div>
				<div class="col-9  text-light ">
					<h1>RESTAURANT 15</h1>
				</div>
				<div class="col-1 ">
				<a href="/user/" class="btn btn-info border-light" role="button">GoBack</a>				
				</div>
				<div class="col-1 text-light">
						<a href="/user/logout" class="btn btn-danger border-light" role="button">Logout</a>
				</div>	
		</div>

		<div class="row">
			<div class="col-2"></div>
			<div class="col-8">


			<h2 class="bold">Menu Information</h2>

				<table class="table table-hover">
					<thead>
						<tr>
							<th>Item Name</th>
							<th>Item price</th>
							<th>Category</th>
							<th>Description</th>
						</tr>
					</thead>
					<tbody>
				
						<c:forEach items="${listmenu}" var="menu">
							<tr>
								<td>${menu.itemName}</td>
								<td>${menu.price}</td>
								<td>${menu.cId}</td>
								<td>${menu.description}</td>
								<td><a href="<c:url value='/user/menu/editMenu/${menu.itemId}'/>">Edit</a></td>
								<td><a href="<c:url value='/user/menu/removeMenu/${menu.itemId}'/>">Delete</a></td>
							</tr>

						</c:forEach>
					</tbody>
				</table>
			</div>



		</div>

		<div class="col-2"></div>
	
	</div>
	
			<div class="col-3"></div>
	
		
		<div class="row ">
			<div class="col-1 "></div>
			<div class="col-11 text-dark ">
				<footer>&copy; Copyright 2020 CDAC</footer>
			</div>
		</div>
	

</body>
</html>









<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>


