package Servlets;

import Controller.VeterinarioController;
import Model.Veterinario;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "login", value = "/login")
public class SvLogin extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        VeterinarioController controller = new VeterinarioController();
        int usuario = Integer.parseInt(request.getParameter("usuario"));//id
        String clave = request.getParameter("clave");//codigo profesional
        String codigo = controller.obtenerVeterinarioById(usuario).getCodigoProfesional();
        if (controller.obtenerVeterinarioById(usuario) != null && codigo.equalsIgnoreCase(clave)) {
            response.sendRedirect("login.jsp");
        }else{
            System.out.println("Datos incorrectos");
        }

    }
}
