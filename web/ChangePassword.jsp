<%-- 
    Document   : ChangePassword
    Created on : Sep 20, 2017, 2:35:44 PM
    Author     : Whisper119
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
           <FORM ACTION="ChangePassword" METHOD="GET">

<div id="login_box">

<div id="login_header">

        Login

</div>

<div id="form_val">

    <div class="label">Email:</div>

    <div class="control"><input type="text" name="Email" id="Email"/></div>

    <div class="label">Password:</div>

    <div class="control"><input type="password" name="Password" id="Password"/></div>

    <div class="label">Confirm Password:</div>

    <div class="control"><input type="password" name="Password" id="Password"/></div>

    <div style="clear:both;height:0px;"></div>

    <div id="msgbox"></div>

</div>

<div id="login_footer">

<!-- <script type="text/javascript">

function closewindow() {

window.close()

}

</script>-->

     <label>

    <input type="submit" onclick="location.href='http://localhost:8080/IntegrateAll/Index.jsp'" window.close();" name="Submit" id="Submit" value="Submit" class="send_button" />

    </label>

</div>

</div>
    </body>
</html>
