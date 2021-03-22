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
    <title>Title</title>
</head>
<body>
<h2>All locations</h2>
<br><br>

<table>
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
        <th>Operations</th>

    </tr>
    <c:forEach var="locs" items="${allLocations}">
      <c:url var="updateButton" value="/updateInfo">
          <c:param name="locId" value="${locs.id}" />
      </c:url>
        <tr>
            <td>${locs.id}</td>

            <td>
                ${locs.longitude}
            </td>
            <td>
                ${locs.latitude}
            </td>
            <td>
                ${locs.type_id}
            </td>
            <td>
                <input type="button" value="Update" onclick="window.location.href='${updateButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>

<br><br>
<input type="button" value="Add" onclick="window.location.href = 'addNewLocation'"/>

</body>
</html>
