<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Антон
  Date: 21.03.2021
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Reviews</title>
</head>
<body>
<h2>All reviews</h2>

<table>
    <tr>
        <th>
            id
        </th>
        <th>
            location_id
        </th>
        <th>
            value
        </th>
        <th>
            comment
        </th>
    </tr>
    <c:forEach var="reviews" items="${allReviews}">
        <tr>
            <td>${reviews.id}</td>
            <td>${reviews.location_id}</td>
            <td>${reviews.value}</td>
            <td>${reviews.comment}</td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
