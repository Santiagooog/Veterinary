package Servlets;

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

@WebServlet(name = "mascota-id", value = "/mascota-id")
public class SvMascotaId extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String mascotaId = request.getParameter("id");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        MascotaController controller = new MascotaController();
        Mascota mascota = controller.obtenerMascotaById(id);
        HttpSession session = request.getSession();
        session.setAttribute("listaMascotaId",mascota);
        response.sendRedirect("mostrarMascotaId.jsp");
    }
}
