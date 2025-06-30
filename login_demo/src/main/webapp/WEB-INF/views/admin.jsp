<!--<%@ page import="java.util.Date" %>
	

-->
<%@ page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false" %>

<html>
<body>
	
	
<form action="wish" method="POST">
	Name: <input name="name" type="text"/>
	Password: <input name="password" type="password"/>
	<input type="submit"/>
</form>
<p><font color="red">${errormessage}</p>
</body>
</html>
