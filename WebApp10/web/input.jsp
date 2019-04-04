<%-- 
    Document   : input
    Created on : Feb 28, 2019, 4:16:58 AM
    Author     : user1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Choose Operation and Value:</h1><br>
        <form action="calculate.jsp" method="GET">
            <input type="text" placeholder="Enter Operand1" name="op1" required>
            <select name="opr">
                <option value="+">+</option>
                <option value="-">-</option>
                <option value="*">*</option>
                <option value="/">/</option>
                <option value="%">%</option>
            </select>
            <input type="text" placeholder="Enter Operand2" name="op2" required><br>
            <input type="submit" value="Calculate">
        </form>
    </body>
</html>
