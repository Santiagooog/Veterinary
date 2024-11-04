<%@ page import="Model.Dueno" %><%--
  Created by IntelliJ IDEA.
  User: Santiagoog
  Date: 4/11/2024
  Time: 12:30 a. m.
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
            Dueno dueno = (Dueno) request.getSession().getAttribute("listaDuenoId");
        %>
        <thead>
        <tr>
            <th>Id</th>
            <th>Nombre</th>
            <th>Edad</th>
            <th>Direccion</th>
            <th>Telefono</th>
            <th>Email</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><%=dueno.getId()%></td>
            <td><%=dueno.getName()%></td>
            <td><%=dueno.getAge()%></td>
            <td><%=dueno.getAdress()%></td>
            <td><%=dueno.getPhone()%></td>
            <td><%=dueno.getEmail()%></td>
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
