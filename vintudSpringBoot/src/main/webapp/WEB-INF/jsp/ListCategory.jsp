<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<html lang="en" xmlns:th="http://www.thymeleaf.org">

<head>
     <title>Gestion des categories</title>
     <link href="<c:url value="/css/common.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
    <h1 align="center">My category List</h1>
    <br/>
    <table border="1">
        <tr>
            <th>Name</th><th>description</th><th>delete</th>
        </tr>
        <c:forEach var="category" items="${listCategoriiiies}">
        <tr>
            <td>${category.getName()}</td>
            <td>${category.getDescription()}</td>
             
             
			<td> 
			
				<a href="${pageContext.request.contextPath }/categoryManagement/delete/${category.getIdCategory()}" >Delete</a>
				
			</td>
        
   			<td> 
			
			<a href="${pageContext.request.contextPath }/categoryManagement/updateCategory/${category.getIdCategory()}/${Name}/${Description}" >update</a>	<input type="text"  name="nameCC" value="Name" /> 	<input type="text"  name="descriptionCC" value="Description" /> 
			
			</td>
           </tr>    
           
        </c:forEach>
    </table>



    
		 				
							  
			
    
</body>
</html>