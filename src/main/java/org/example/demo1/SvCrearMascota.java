package org.example.demo1;

import Controller.DuenoController;
import Controller.MascotaController;
import Model.Dueno;
import Model.Mascota;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "crear-mascota", value = "/crear-mascota")
public class SvCrearMascota extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("crearMascota.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("nombre");
        String raza = request.getParameter("raza");
        int edad = Integer.parseInt(request.getParameter("edad"));
        int dueno_id = Integer.parseInt(request.getParameter("dueno_id"));
        int veterinario_id = Integer.parseInt(request.getParameter("veterinario_id"));
        Mascota mascota = new Mascota();
        mascota.setName(name);
        mascota.setBreed(raza);
        mascota.setAge(edad);
        mascota.setIdDueno(dueno_id);
        mascota.setIdVeterinario(veterinario_id);
        MascotaController mas = new MascotaController();
        mas.insertarMascota(mascota);


        response.sendRedirect("index.jsp");
    }
}
