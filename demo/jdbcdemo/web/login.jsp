<%-- 
    Document   : login
    Created on : Nov 16, 2016, 8:21:11 PM
    Author     : Thomas Hartmann - tha@cphbusiness.dk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Login" method="POST">
            <input type="text" name="username" value="" />
            <input type="text" name="password" value="" />
            <input type="submit" value="Log in" name="submit" />
        </form>
    </body>
</html>
