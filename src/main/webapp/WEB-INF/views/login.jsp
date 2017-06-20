<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/home.css"/>">
</head>
<body>

<form:form method="post" commandName="user"
           class="box login" action="checkUser">
    <fieldset class="boxBody">
        <form:label path="username">username</form:label>
        <form:input path="username"/>
        <form:errors path="username" cssClass="error"/>

        <form:label path="password">password</form:label>
        <form:input path="password"/>
        <form:errors path="password" cssClass="error"/>

    </fieldset>
    <footer>
        <form:label path="admin">admin</form:label>
        <form:checkbox path="admin"/>
        <input type="submit" class="btnLogin" value="Login" tabindex="4">
    </footer>
</form:form>

</body>
</html>
