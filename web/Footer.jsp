<%-- 
    Document   : Footer
    Created on : Sep 18, 2017, 8:08:27 AM
    Author     : Whisper119
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
     
<center>

<p>Copyright © 2017 <%=new java.util.Date() %></p>

</center>
Syntax for include directive

<%@ include file="url" %>

index.jsp

<%@ include file="header.html" %>

<p><a href="cse.jsp" target="new">User</a></p>

<p><a href="ece.jsp" target="new">Login_Failure</a></p>

<p><a href="eee.jsp" target="new">Account_activity</a></p>

<p><a href="eee.jsp" target="new">Success</a></p>

<p><a href="eee.jsp" target="new">New_customer</a></p>

<p><a href="eee.jsp" target="new">Login</a></p>

<p><a href="eee.jsp" target="new">index</a></p>

<%@ include file="footer.jsp" %>

User.html

<%@ include file="header.html" %>

<p><center>TOBA </center></p>

<%@ include file="footer.jsp" %>

Login_Failure.html

<%@ include file="header.html" %>

<p><center>TOBA</center> </p>

<%@ include file="footer.jsp" %>

Account_activity.html

<%@ include file="header.html" %>

<p><center>TOBA</center></p>

<%@ include file="footer.jsp" %>

Success.html

<%@ include file="header.html" %>

<p><center>TOBA</center></p>

<%@ include file="footer.jsp" %> 

New_customer.html

<%@ include file="header.html" %>

<p><center>TOBA</center></p>

<%@ include file="footer.jsp" %> 

Login.html

<%@ include file="header.html" %>

<p><center>TOBA</center></p>

<%@ include file="footer.jsp" %> 

index.html

<%@ include file="header.html" %>

<p><center>TOBA</center></p>

<%@ include file="footer.jsp" %> 

</body>
</html>
