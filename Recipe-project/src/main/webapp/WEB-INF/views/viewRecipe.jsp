<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="/css/bootstrap.css"      rel="stylesheet">
	<link href="/css/custom.css"      rel="stylesheet">
	<link href="/css/main.css"      rel="stylesheet">
</head>
<body>
<h6 align="center">Recipe List</h6>
<table id="t02"  cellpadding="1">
<tr>
<th>
<a  href="http://localhost:8080/getForm"><h5>Home Page:Enroll New Recipe</h5></a>

</th>

<th>

<a  align ="right" href="http://localhost:8080/deleteallrecipes"><h5>Delete All Recipe</h5></a>
</th>
</tr>
</table>

<form:form  class="form-horizontal" >
<table id="t01" border="1" width="70%" cellpadding="2">
<tr><th>Id</th><th>Name</th>
<th>Category</th><th>Detail</th>
<th>Edit</th><th>Delete</th></tr>  

   <c:forEach var="recipe" items="${list}"> 
   <tr>  
   <td>${recipe.id}</td>  
   <td>${recipe.name1}</td> 
   <td>${recipe.category}</td>  
   <td>${recipe.detail}</td> 
   <td>${recipe.vegOrNonveg}</td>
   <td>${recipe.createdAt}</td> 
   <td><a href="http://localhost:8080/editrecipe/${recipe.id}">Edit</a></td>  
   <td><a href="/deleterecipe/${recipe.id}">Delete</a></td>  
   </tr>  
   </c:forEach> 
  
   </table>  
   <br/>
  
   </form:form>
</body>
</html>