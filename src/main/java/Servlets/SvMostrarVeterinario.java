package Servlets;

import java.io.*;
import java.util.List;

import Controller.VeterinarioController;
import Model.Veterinario;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class SvMostrarVeterinario extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            String veterinarioId = request.getParameter("veterinarioId");
            VeterinarioController controller = new VeterinarioController();
            List<Veterinario> listaVeterinarios = controller.obtenerVeterinarios();
            HttpSession session = request.getSession();
            session.setAttribute("listaVeterinario",listaVeterinarios);
            response.sendRedirect("mostrarVeterinario.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("nombre");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        System.out.println(name + email + telefono);

    }

}