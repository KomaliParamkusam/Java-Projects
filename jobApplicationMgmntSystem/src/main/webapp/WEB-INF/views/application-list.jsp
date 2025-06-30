<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head><title>Applications List</title></head>
<body>
	<center>
<h2>All Applications</h2>
<table border="1">
    <tr>
		<th>ID</th>
		<th>FirstName</th>
		<th>Email</th>
		<th>Position</th></tr>
    <c:forEach var="app" items="${applicationsList}">
        <tr>
            <td>${app.id}</td>
            <td>${app.firstName}</td>
            <td>${app.email}</td>
            <td>${app.position}</td>
			<td>
				
				<a href="/jobApplicationMgmntSystem/delete?id=${app.id}">Delete</a>

			           <!-- <a href="/delete?id=${app.id}">
			               Delete
			            </a>-->
			        </td>
			               
			
        </tr>
    </c:forEach>
</table>
	<a href="/jobApplicationMgmntSystem/form">Application Form</a>
	</center>
</body>
</html>
