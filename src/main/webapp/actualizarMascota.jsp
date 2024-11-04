<%--
  Created by IntelliJ IDEA.
  User: Santiagoog
  Date: 4/11/2024
  Time: 2:14 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Actualizar mascota</title>
</head>
<body>
<section>
    <form action="actu-mascota" method="POST">
        <label>
            Id
            <input type="number" name="id">
        </label>
        <label>
            Nombre
            <input type="text" name="nombre">
        </label>
        <label>
            Raza
            <input type="text" name="raza">
        </label>
        <label>
            Edad
            <input type="number" name="edad">
        </label>
        <label>
            Id del dueño
            <input type="number" name="dueno_id">
        </label>
        <label>
            Id del veterinario
            <input type="number" name="veterinario_id">
        </label>
        <input type="submit" value="Actualizar mascota">

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
