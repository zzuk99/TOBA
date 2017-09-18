<%-- 
    Document   : Footer
    Created on : Sep 18, 2017, 8:08:27 AM
    Author     : Whisper119
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
     
	<h1>${param.title}</h1>

	<jsp:include page="/WEB-INF/pages/${param.content}.jsp"/>
	
	<jsp:include page="/WEB-INF/pages/footer.jsp"/>
    </body>
    <footer
       
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="date" class="java.util.Date" />
Current year is: <fmt:formatDate value="${date}" pattern="yyyy" />
</footer>
    
</html>
