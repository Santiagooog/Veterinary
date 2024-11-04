<%@ page import="Model.Dueno" %>
<%@ page import="java.util.List" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Dueños</h1>
<section class="container">
    <h1>Lista de dueños</h1>

    <form action="dueno-id" method="POST">
        <label>Id
            <input type="number" required name="id">
        </label>
        <input type="submit" value="Buscar">
    </form>
    <table>
        <%
            List<Dueno> listaDuenos = (List) request.getSession().getAttribute("listaDueno");
            for(Dueno dueno : listaDuenos) {
        %>
        <thead>
        <tr>
            <th>Id</th>
            <th>Nombre</th>
            <th>Edad</th>
            <th>Dirección</th>
            <th>Teléfono</th>
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
        <%
            }
        %>
    </table>
</section>
</body>
</html>
