package org.example.demo1;

import Controller.VeterinarioController;
import Model.Veterinario;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "delete-vet", value = "/delete-vet")
public class SvDeletVet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("deleteVet.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        VeterinarioController vet = new VeterinarioController();
        vet.eliminarVeterinario(id);
        response.sendRedirect("index.jsp");
    }
}
