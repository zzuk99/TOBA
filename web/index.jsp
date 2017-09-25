<%-- 
    Document   : index
    Created on : Sep 17, 2017, 8:18:52 AM
    Author     : Whisper119
--%>

<%@page import="javax.xml.registry.infomodel.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>
<HEAD><TITLE>Welcome</TITLE></HEAD>
<BODY>
<br><br><br><br>
<table align="center" style="border:1px solid #000000;">
<%
if(User.getAttribute("unmae")!=null && User.getAttribute("unmae")!="")
{
String user = User.getAttribute("unmae").toString();
%>
<tr><td align="center"><h1>Welcome <b><%= user%></b></h1></td></tr>
<%
}
%>
<form action="servlet/User" method="post"> 
Name:<input type="text" name="userName"/><br/><br/>
Password:<input type="password" name="userPass"/><br/><br/>
Email Id:<input type="text" name="userEmail"/><br/><br/>
Country:
<select name="userCountry">
<option>USA</option>
<option>China</option>
<option>other</option>
</select>
  
<br/><br/>
<input type="submit" value="register"/>
  
</form>
</table>
</body>
<html>
