<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<%@page import="com.Bill.Order_details"%>
<%@page import="com.Bill.Bill_Controller"%>	

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<table>
			<thead>
				<tr>
					<th>item_id</th>
					<th>name</th>
					<th>quantity</th>
					<th>price</th>
					<th>customer_id</th>
					<th>date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="bill">

					<tr>
						<td>${bill.item_id}</td>
						<td>${bill.name}</td>
						<td>${bill.quantity}</td>
						<td>${bill.price}</td>
						<td>${bill.customer_id}</td>
						<td>${bill.date}</td>

					</tr>

				</c:forEach>


			</tbody>


		</table>
	</form>


</body>
</html>