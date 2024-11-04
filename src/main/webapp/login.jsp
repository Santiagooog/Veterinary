<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Veterinaria</title>
</head>
<body>
<h1> Sistema de gestion veterinaria</h1>
<section>

  <div class="container-veterinario">
    <form action="hello-servlet" method="GET">
      <button type="submit" class="minimal-button">Mostrar veterinarios</button>
    </form>
    <form action="crear-vet" method="GET">
      <button type="submit" class="minimal-button">Crear veterinario</button>
    </form>
    <form action="actu-vet" method="GET">
      <button type="submit" class="minimal-button">Actualizar veterinario</button>
    </form>
    <form action="delete-vet" method="GET">
      <button type="submit" class="minimal-button">Eliminar veterinario</button>
    </form>
  </div>
  <div class="container-dueno">
    <form action="ver-dueno" method="GET">
      <button type="submit" class="minimal-button">Mostrar Dueño</button>
    </form>
    <form action="crear-dueno" method="GET">
      <button type="submit" class="minimal-button">Crear Dueño</button>
    </form>
    <form action="actu-dueno" method="GET">
      <button type="submit" class="minimal-button">Actualizar Dueño</button>
    </form>
    <form action="delete-dueno" method="GET">
      <button type="submit" class="minimal-button">Eliminar Dueño</button>
    </form>
  </div>
  <div class="container-mascota">
    <form action="ver-mascota" method="GET">
      <button type="submit" class="minimal-button">Mostrar mascota</button>
    </form>
    <form action="crear-mascota" method="GET">
      <button type="submit" class="minimal-button">Crear mascota</button>
    </form>
    <form action="actu-mascota" method="GET">
      <button type="submit" class="minimal-button">Actualizar mascota</button>
    </form>
    <form action="delete-mascota" method="GET">
      <button type="submit" class="minimal-button">Eliminar mascota</button>
    </form>
  </div>
</section>
</body>
<style>
  body{
    background-color: #acaaaa7b;
  }
  .minimal-button {
    width: 150px;
    padding: 10px;
    margin: 5px;
    font-size: 14px;
    font-family: Arial, sans-serif;
    color: #333;
    background-color: #f9f9f9;
    border: 1px solid #ddd;
    border-radius: 8px;
    cursor: pointer;
    transition: background-color 0.3s, color 0.3s, box-shadow 0.3s;
  }

  .minimal-button:hover {
    background-color: #e0e0e0;
    color: #000;
    box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
  }

  .minimal-button:active {
    background-color: #d0d0d0;
    box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.2);
  }
  h1{
    margin-top: 70px;
    text-align: center;
    font-size: 50px;
    margin-bottom: 130px;
  }
  section{
    display: flex;
    flex-wrap: wrap;
    justify-content:space-around;
  }

  .container-veterinario button{
    margin-bottom: 30px;
    width: 300px;
  }
  .container-dueno button{
    margin-bottom: 30px;
    width: 300px;
  }
  .container-mascota button{
    margin-bottom: 30px;
    width: 300px;
  }
</style>
</html>