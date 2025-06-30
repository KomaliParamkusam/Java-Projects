<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Spotify Profile</title>
    <style>
        body {
            font-family: Arial;
            margin: 40px;
            background: #f9f9f9;
        }

        .search-box {
            margin-bottom: 30px;
        }

        .track-container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            gap: 20px;
        }

        .track {
            width: 180px;
            background: white;
            border: 1px solid #ccc;
            border-radius: 10px;
            padding: 10px;
            text-align: center;
            box-shadow: 2px 2px 10px rgba(0,0,0,0.1);
        }

        .track img {
            border-radius: 8px;
            width: 100%;
            height: auto;
        }

        .error {
            color: red;
            margin-top: 20px;
        }
    </style>
</head>
<body>

    <h1 style="text-align:center;">Welcome, ${name}!</h1>

    <div class="search-box" style="text-align:center;">
        <form method="get" action="/profile">
            <input type="text" name="query" placeholder="Search for a track..." value="${searchQuery}" />
            <button type="submit">Search</button>
        </form>
    </div>

    <c:if test="${not empty results}">
        <h2 style="text-align:center;">Search Results</h2>
        <div class="track-container">
            <c:forEach var="item" items="${results}">
                <div class="track">
                    <img src="${item.imageUrl}" alt="Cover Art" />
                    <div><strong>${item.name}</strong></div>
                    <div>(${item.type})</div>
                    <div><a href="${item.externalUrl}" target="_blank">Play on Spotify</a></div>
                </div>
            </c:forEach>
        </div>
    </c:if>

    <c:if test="${not empty error}">
        <div class="error">${error}</div>
    </c:if>

</body>
</html>
