<%-- 
    Document   : DisplayMovieList
    Created on : 18 Jan, 2019, 12:03:25 AM
    Author     : mj
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.app.Movie"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <jsp:useBean id="movie" class="com.app.Movie" />
        <jsp:getProperty name="movie" property="genre" />
    </body>
</html>
