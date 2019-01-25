<%-- 
    Document   : Controller
    Created on : Jan 25, 2019, 12:17:23 AM
    Author     : user1
--%>

<%@page import="java.lang.Integer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="com.app.*,javax.servlet.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        <jsp:useBean id="info" scope = "request" class = "com.app.Calculator" />
        
        <h1>Answer of <jsp:getProperty name="info" property="op1"/>  <jsp:getProperty name="info" property="operator"/> 
        <jsp:getProperty name="info" property="op2"/> is: </h1>
        <jsp:getProperty name="info" property="result"/>
        
        <%  
            ServletContext context;
            context = getServletContext();
            Integer count  = (Integer) context.getAttribute("hits");
            context.setAttribute("hits",++count);
            
        %>
      
    
</html>
