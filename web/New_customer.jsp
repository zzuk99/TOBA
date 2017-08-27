<%-- 
    Document   : New_customer
    Created on : Aug 27, 2017, 4:15:22 PM
    Author     : Whisper119
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New User Registration</title>
    </head>
    <body>
      <form method="post" action="NewCustomer">

        First Name:<input type="text" name="fname" /><br/>

        Last Name:<input type="text" name="lname" /><br/>

        Phone:<input type="text" name="phone" /><br/>

        Address:<input type="text" name="address" /><br/>

        City:<input type="text" name="city" /><br/>

        State:<input type="text" name="state" /><br/>

        Zip Code:<input type="text" name="zipcode" /><br/>

        E-Mail:<input type="text" name="email" /><br/>

        <input type="submit" value="Register" />

        </form>
    </body>
</html>
