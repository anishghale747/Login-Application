<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Login Page</title>
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
    </head>
    <body>    
        <div class="login-page">    
            <div class="form">
                <h1>Login Form</h1>
                <form class="login-form" style="display: block;" action="LoginServlet">
                    <input type="text" placeholder="Username" name = "username">
                    <input type="password" placeholder="Password" name = "password">
                    <button value="Submit">LOG IN</button>
                </form>
            </div>
        </div>    
    </body> 
</html>

