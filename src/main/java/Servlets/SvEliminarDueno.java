package Servlets;

import Controller.DuenoController;
import Controller.VeterinarioController;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "delete-dueno", value = "/delete-dueno")
public class SvEliminarDueno extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("eliminarDueno.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        DuenoController dueno = new DuenoController();
        dueno.eliminarDueno(id);
        response.sendRedirect("login.jsp");
    }
}
