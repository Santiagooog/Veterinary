<%@ page import="Model.Mascota" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mascotas</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<h1>Mascotas</h1>
<section class="container">
    <h1>Lista de mascotas</h1>

    <form action="mascota-id" method="POST">
        <label>Id
            <input type="number" required name="id">
        </label>
        <input type="submit" value="Buscar">
    </form>
    <table>
        <%
            List<Mascota> listaMascotas = (List) request.getSession().getAttribute("listaMascota");
            for(Mascota mascota : listaMascotas) {
        %>
        <thead>
        <tr>
            <th>Id</th>
            <th>Nombre</th>
            <th>Raza</th>
            <th>Edad</th>
            <th>Id del dueño</th>
            <th>Id del veterinario</th>
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
        <%
            }
        %>
    </table>
</section>
</body>
</html>
