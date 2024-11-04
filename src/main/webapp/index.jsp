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
<section class="container">
    <h1>Login</h1>
    <form action="login" method="POST">
        <div class="inputs">
            <label>
                <input type="text" placeholder="User" required name="usuario">
            </label>
        </div>
        <div class="inputs">
            <label>
                <input type="text" placeholder="Password" required name="clave">
            </label>
        </div>
        <div class="boton">
            <input class="boton" type="submit" value="Ingresar">
        </div>
    </form>
</section>
<style>
    body{
        margin :50px;
        background-color: #88b5ef;
    }

    .container{
        background-color: azure;
        width: 400px;
        height: 500px;
        margin: auto;
        padding: 20px;
        justify-items: center;
        box-sizing: border-box;
        border-radius: 50px;
    }
    h1{
        color: #88b5ef;
        font-size: 50px;
        font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
    }
    form{
        border-radius: 50px;
        padding: 5px;
        background-color: #88b5efd3;
        width: 300px;
        height: 280px;
        justify-items: center;
    }
    .inputs input{
        margin-top: 30px;
        border-radius: 10px;
        width: 200px;
        height: 40px;
    }

    .boton{
        margin-top: 30px;
    }
    .boton input{
        width: 100px;
        height: 40px;
        border-radius: 10px;
    }

</style>
</html>
