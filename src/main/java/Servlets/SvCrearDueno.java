package Servlets;

import Controller.DuenoController;
import Controller.VeterinarioController;
import Model.Dueno;
import Model.Veterinario;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "crear-dueno", value = "/crear-dueno")
public class SvCrearDueno extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("crearDueno.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        String codigoProfesional = request.getParameter("email");
        Dueno dueno = new Dueno();
        dueno.setName(name);
        dueno.setAge(edad);
        dueno.setAdress(direccion);
        dueno.setPhone(telefono);
        dueno.setEmail(codigoProfesional);
        DuenoController due = new DuenoController();
        due.insertarDueno(dueno);


        response.sendRedirect("login.jsp");
    }
}
