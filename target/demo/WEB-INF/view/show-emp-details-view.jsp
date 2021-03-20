<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Антон
  Date: 19.03.2021
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Congrats!</title>
</head>
<body>
<h2>Welcome</h2>
<%--<h2>${param.employeeName}</h2>--%>

Longitude: ${location.longitude}
<br>
Latitude: ${location.latitude}
<br>
Type: ${location.type}
<br>
Email: ${location.email}
<br>
Your place:
${location.naming}
<ul>
    <c:forEach var="con" items="${location.cons}">
        <li>
            <br>
            ${con}
        </li>
    </c:forEach>

</ul>
</body>
</html>
