<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    

    
<html>
<head>
	<title>Edit Employee</title>
</head>
<body>
	<div class="header">
		<h6 style="float:center; font-weight:bold;">Edit Employee Details</h6>
	</div>
	<div class="form">
		<form:form method="POST" modelAttribute="recipe" action="/editsave/${recipe.id}">
			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" id="name1" name="name1" value="${recipe.name1}" /></td>
				</tr>
				<tr>
					<td>Category</td>
					<td><input type="text" id="category" name="category" value="${recipe.category}" /></td>
				</tr>
				<tr>
					<td>Detail</td>	
					<td><input type="text" id="detail" name="detail" value="${recipe.detail}" /></td>
				</tr>
				<tr>
					<td>VegOrNonveg</td>	
					<td><input type="text" id="vegOrNonveg" name="vegOrNonveg" value="${recipe.vegOrNonveg}" /></td>
				</tr>
				<tr>
				<td colspan="2" align="center"><input type="submit" value="Update"></td>
				</tr>
			</table>	
		</form:form>
	</div>
</body>
</html>