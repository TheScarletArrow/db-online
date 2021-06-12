<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Антон
  Date: 22.03.2021
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new location</title>
    <style>
        <%@include file='../css/main.css' %>
    </style>
</head>
<body>
<h2 style=" "><a href="${pageContext.request.contextPath}/locations"> All locations</a></h2>
<br>
<div class="left">
    <h3>Parameters</h3>
    <div class="form__group">
        <form:form action="saveLocation" modelAttribute="location" cssStyle="position: center">

            <form:hidden path="id"/>
            <label class="form__label" id="longitude" name="longitude">Longitude</label>
            <form:input path="longitude" class="form__input"/>
            <form:errors path="longitude"/>
            <br><br>
            <label class="form__label">Latitude</label>
            <form:input path="latitude" class="form__input"/>
            <br><br>
            <label class="form__label">Type_id</label>
            <form:input path="type_id" class="form__input"/>
            <br> <br>


            <button style="width: 100px; font-size: 15pt; height: 45px; margin-left: 45%; margin-top: 10%"
                    class="button" value="OK"> Add new values
            </button>

        </form:form>
    </div>
</div>
</body>
</html>
