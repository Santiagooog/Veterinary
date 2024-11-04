<%@ page import="Model.Mascota" %><%--
  Created by IntelliJ IDEA.
  User: Santiagoog
  Date: 4/11/2024
  Time: 2:12 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<section>
  <table>
    <%
      Mascota mascota = (Mascota) request.getSession().getAttribute("listaMascotaId");
    %>
    <thead>
    <tr>
      <th>Id</th>
      <th>Nombre</th>
      <th>Raza</th>
      <th>Edad</th>
      <th>Dueño id</th>
      <th>Veterinario id</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td><%=mascota.getId()%></td>
      <td><%=mascota.getName()%></td>
      <td><%=mascota.getBreed()%></td>
      <td><%=mascota.getAge()%></td>
      <td><%=mascota.getIdDueno()%></td>
      <td><%=mascota.getIdVeterinario()%></td>
    </tr>

    </tbody>
    <style>
      table {
        width: 100%;
        border-collapse: collapse;
      }
      th, td {
        padding: 8px;
        text-align: left;
        border-bottom: 1px solid #ddd;
      }
      th {
        background-color: #f2f2f2;
      }
      h1{
        text-align:center;
        margin-bottom: 50px;
      }
    </style>
  </table>
</section>
</body>
</html>
