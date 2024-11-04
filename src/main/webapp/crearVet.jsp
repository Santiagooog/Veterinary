<%--
  Created by IntelliJ IDEA.
  User: Santiagoog
  Date: 3/11/2024
  Time: 1:24 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<section>
<form action="crear-vet" method="POST">
    <label>
        Nombre
        <input type="text" name="nombre">
    </label>
    <label>
        Edad
        <input type="number" name="edad">
    </label>
    <label>
        Direccion
        <input type="text" name="direccion">
    </label>
    <label>
        Telefono
        <input type="number" name="telefono">
    </label>
    <label>
        Codigo Profesional
        <input type="text" name="codigoProfesional">
    </label>
    <input type="submit">

</form>
</section>
</body>
<style>
    section{
        background-color: #8e8b8b;
        display:flex;
        max-width: 900px;
        justify-content:center;
        margin:0;
    }
    label{
        display:flex;
        margin-top:30px;
        margin-bottom:10px;
        margin-left: 10px;
    }
</style>
</html>
