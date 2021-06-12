<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Антон
  Date: 20.03.2021
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Location list</title>
    <%--    <link rel="stylesheet" type="text/css" href="../css/main.css"/>--%>
    <style>
        <%@include file='../css/main.css' %>
    </style>
</head>
<body>
<h2 style="position:fixed; "><a href="${pageContext.request.contextPath}/locations"> All locations</a></h2>
<br><br>
<div class="left">

    <table style="position: center">
        <tr>
            <th>
                id
            </th>
            <th>
                Longitude
            </th>
            <th>
                Latitude
            </th>
            <th>
                type_id
            </th>
            <th> Operations</th>
                    </tr>

    <c:forEach var="locs" items="${allLocations}">
            <c:url var="updateButton" value="/updateInfo">
                <c:param name="locId" value="${locs.id}"/>
            </c:url>

            <c:url var="deleteButton" value="/deleteInfo">
                <c:param name="locId" value="${locs.id}"/>
            </c:url>
            <tr>
                <td>${locs.id}</td>
                <td>${locs.longitude}</td>
                <td>${locs.latitude}</td>
                <td>${locs.type_id}</td>
                <td class="wrapper">
                    <button class="button" value="Update" onclick="window.location.href='${updateButton}'">
                        <span>Update</span>
                    </button>
                </td>
                <td class="wrapper">
                    <button class="button" value="Delete" onclick="window.location.href='${deleteButton}'"> Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
    </table>

    <br><br>
    <button class="button" style="width: 100px; font-size: 15pt; height: 45px; margin-left: 45%" value="Add"
            onclick="window.location.href = '${pageContext.request.contextPath}/addNewLocation'"><span>Add</span>
    </button>
</div>


<jsp:include page="all-speedtests.jsp"/>


</body>
</html>
