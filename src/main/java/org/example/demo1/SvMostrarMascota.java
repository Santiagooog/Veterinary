package org.example.demo1;

import Controller.DuenoController;
import Controller.MascotaController;
import Model.Dueno;
import Model.Mascota;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ver-mascota", value = "/ver-mascota")
public class SvMostrarMascota extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        MascotaController controller = new MascotaController();
        List<Mascota> listaMascotas = controller.obtenerMascotas();
        HttpSession session = request.getSession();
        session.setAttribute("listaMascota",listaMascotas);
        response.sendRedirect("mostrarMascotas.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }
}
