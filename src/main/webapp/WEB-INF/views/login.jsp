<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/home.css"/>">
</head>
<body>

<form:form method="post" commandName="user"
           class="box login" action="checkUser">
    <fieldset class="boxBody">

        <span style="float: right">
            <a href="?lang=en" style="color: #0d6db6">en</a>
            <a href="?lang=ru" style="color: #b64d34">ru</a>
        </span>

        <form:label path="username"><spring:message code="username"/> </form:label>
        <form:input path="username"/>
        <form:errors path="username" cssClass="error"/>

        <form:label path="password"><spring:message code="password"/></form:label>
        <form:input path="password"/>
        <form:errors path="password" cssClass="error"/>

    </fieldset>
    <footer>
        <form:label path="admin"><spring:message code="admin"/></form:label>
        <form:checkbox path="admin"/>
        <input type="submit" class="btnLogin" value="<spring:message code="enter"/>" >
    </footer>
</form:form>

</body>
</html>
