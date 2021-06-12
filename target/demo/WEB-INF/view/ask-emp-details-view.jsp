<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Антон
  Date: 19.03.2021
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>ask</title>
</head>
<body>
<br><br>
<form:form action="showDetails" modelAttribute="location" method="post">
    Longitude <form:input path="longitude"/>
    <br>
    Latitude <form:input path="latitude"/>
    <br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    Type <form:select path="type">

    <form:options items="${location.types}"/>
    <form:errors path="type"/>

    <br>
    <br>


</form:select>
    <br>
    <br>
    What is the name of this place?
    <br>
    <br>
    <form:radiobuttons path="naming" items="${location.locations}"/>
    <br>
    <form:errors path="naming"/>

    <br>
    Con(s):
    <br>
    <form:checkboxes path="cons" items="${location.consMap}"/>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
