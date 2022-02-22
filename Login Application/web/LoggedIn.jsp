<%@page import="org.personal.bean.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <title>   User Logged In Successfully   </title>
    </head>
    <body>
    <center>
        <div class ="loggedIn-page">
            <div class="form">
                <h1>Welcome to Home Page</h1>
                <h1><b>${currentSessionUser.firstName} ${currentSessionUser.lastName}</b></h1>
            </div>
        </div>

    </center>

</body>

</html>
