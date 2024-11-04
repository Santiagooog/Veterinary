package org.example.demo1;
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

@WebServlet(name = "ver-dueno", value = "/ver-dueno")
public class SvMostrarDueno extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        DuenoController controller = new DuenoController();
        List<Dueno> listaDuenos = controller.obtenerDuenos();
        HttpSession session = request.getSession();
        session.setAttribute("listaDueno",listaDuenos);
        response.sendRedirect("mostrarDuenos.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("nombre");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        System.out.println(name + email + telefono);

    }
}
