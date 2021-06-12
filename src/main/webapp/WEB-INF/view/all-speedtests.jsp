<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Антон
  Date: 12.06.2021
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    <%@include file='../css/main.css' %>
</style>
<br><br>
<table style="position: center">
    <tr>
        <th>id</th>
        <th> Operator Id</th>
        <th>Location Id</th>
        <th>Download Speed</th>
        <th>Upload Speed</th>
        <th>Latency</th>
    </tr>
    <c:forEach var="tests" items="${allSpeedTests}">
        <tr>
            <td>look at ${tests.id}</td>
            <td>look ${tests.operator}</td>
            <td>look ${tests.location}</td>
            <td>look ${tests.downloadSpeed}</td>
            <td>look ${tests.uploadSpeed}</td>
            <td>look ${tests.latency}</td>
        </tr>
    </c:forEach>
</table>