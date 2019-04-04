<%-- 
    Document   : showColors
    Created on : Feb 28, 2019, 4:03:25 AM
    Author     : user1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="mine" tagdir="/WEB-INF/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <mine:showColor color="${requestScope.colorList}"/><br>    
</html>
