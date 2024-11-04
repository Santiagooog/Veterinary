<%--
  Created by IntelliJ IDEA.
  User: Santiagoog
  Date: 4/11/2024
  Time: 2:41 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<section class="container">
    <h1>Login</h1>
    <form action="login" method="POST">
        <label>
            <input type="number" placeholder="User" required name="usuario">
        </label>
        <label>
            <input type="text" placeholder="Password" required name="clave">
        </label>
        <input class="boton" type="submit">
    </form>
</section>
</body>
<style>
    body{
        background-color: aliceblue;

        display: flex;
        justify-content: center;
    }

    .container{
        margin-top: 80px;
        align-items: center;
        background-color: beige;
        max-width: 220px;
        height: 300px;
        display: flex;
        flex-direction: column;
        flex-wrap: wrap;
        padding: 20px;

    }

    .container input{
        max-width: 200px;
        margin-bottom: 30px;
    }

</style>
</html>
