<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Employee List</title>
</head>
<body>
    <h2>Employee Names</h2>
    <ul>
        <c:forEach var="name" items="${names}">
            <li>${name}</li>
        </c:forEach>
    </ul>
</body>
</html>
