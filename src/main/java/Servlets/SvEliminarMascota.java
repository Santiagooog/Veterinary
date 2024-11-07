package Servlets;

import Controller.DuenoController;
import Controller.MascotaController;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "delete-mascota", value = "/delete-mascota")
public class SvEliminarMascota extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("eliminarMascota.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        MascotaController mascota = new MascotaController();
        mascota.eliminarMascota(id);
        response.sendRedirect("login.jsp");
    }
}
