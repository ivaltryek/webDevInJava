<%-- 
    Document   : calculator
    Created on : Feb 28, 2019, 4:38:27 AM
    Author     : user1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="cal" uri="/WEB-INF/tlds/myTld" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <c:if test="${param.opr ne null && !empty param.opr && param.op1 ne null && !empty param.op1 && param.op2 ne null && !empty param.op2 }">
            <cal:calculate op1="${param.op1}" op2="${param.op2}" opr="${param.opr}"/>
        </c:if>
        <jsp:include page="input.jsp"/>
        <a href="input.jsp">Calculate</a>
    </body>
</html>
