<%-- 
    Document   : showColor
    Created on : Feb 28, 2019, 3:34:44 AM
    Author     : user1
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8" body-content="empty"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="color" required="true" rtexprvalue="true" type="java.util.ArrayList<com.beans.Color>"%>
<%@attribute name="attr2"%>
<c:forEach var="col" items="${color}">
    ${col}<br>
</c:forEach>