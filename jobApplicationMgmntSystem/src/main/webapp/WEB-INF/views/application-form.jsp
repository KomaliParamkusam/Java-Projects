<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false" %>

<head><title>Job Application</title></head>
<body>
	<center>
<h2>Application Form</h2>
<form:form modelAttribute="application" method="post" action="save">
	Id:     <form:input path="id"/><br/>
	Name:   <form:input path="firstName"/><br/>
    Email:   <form:input path="email"/><br/>
    Position:   <form:input path="position"/><br/>
    <input type="submit" value="Submit"/>
</form:form>
<p><font color="red">${error}</p>
	</center>
</body>
</html>
