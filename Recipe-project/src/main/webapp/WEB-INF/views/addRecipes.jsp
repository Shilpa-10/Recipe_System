<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<html>
<head>
	<title>Add Recipe</title>
</head>
<body>
	<div class="header">
		<h6 style="float:center; font-weight:bold;">Add Recipe</h6>
	</div>
	<div class="form">
		<form method="POST" action="recipes">
			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" id="name1" name="name1"/></td>
				</tr>
				<tr>
					<td>Category</td>
					<td><input type="text" id="category" name="category"/></td>
				</tr>
				<tr>
					<td>Detail</td>	
					<td><input type="textarea" id="detail" name="detail"/></td>
				</tr>
				<tr>
					<td>VegOrNonveg</td>	
					<td><input type="textarea" id="vegOrNonveg" name="vegOrNonveg"/></td>
				</tr>
				<tr>
				<td colspan="2" align="center"><input type="submit" value="Add"></td>
				</tr>
			</table>	
		</form>
	</div>
</body>
</html>