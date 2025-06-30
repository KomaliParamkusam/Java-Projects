<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html>
<head>
    <title>Image Upload (JSP)</title>
</head>
<body>
    <h2>Upload an Image</h2>
    <form method="post" action="/upload" enctype="multipart/form-data">
        <input type="file" name="file" required />
        <button type="submit">Upload</button>
    </form>

    <c:if test="${not empty imagePath}">
        <h3>Uploaded Image:</h3>
        <img src="${imagePath}" width="300" />
    </c:if>
</body>
</html>
