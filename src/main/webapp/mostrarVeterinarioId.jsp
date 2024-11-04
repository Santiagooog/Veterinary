<%@ page import="Model.Veterinario" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<section>
<table>
    <%
        Veterinario vet = (Veterinario) request.getSession().getAttribute("listaVetId");
    %>
    <thead>
    <tr>
        <th>Id</th>
        <th>Nombre</th>
        <th>Edad</th>
        <th>Direccion</th>
        <th>Telefono</th>
        <th>Codigo Profesional</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td><%=vet.getId()%></td>
        <td><%=vet.getName()%></td>
        <td><%=vet.getAge()%></td>
        <td><%=vet.getAdress()%></td>
        <td><%=vet.getPhone()%></td>
        <td><%=vet.getCodigoProfesional()%></td>
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
