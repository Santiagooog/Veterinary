<%@ page import="Model.Veterinario" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="styles.css">
    <title>Lista de veterinarios</title>
</head>
<body>

    <h1>Lista de veterinarios registrados</h1>
    <section class="container">
        <h1>Lista de veterinarios</h1>

        <form action="vet-id" method="POST">
            <label>Id
                <input type="number" required name="id">
            </label>
            <input type="submit" value="Buscar">
        </form>
        <table>
            <%
                List<Veterinario> listaVeterinario = (List) request.getSession().getAttribute("listaVeterinario");
                int cont = 1;
                for(Veterinario vet : listaVeterinario) {
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
            <%
                }
            %>
        </table>
    </section>
</body>
</html>
