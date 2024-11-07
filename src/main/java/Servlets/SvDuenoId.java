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

@WebServlet(name = "dueno-id", value = "/dueno-id")
public class SvDuenoId extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String duenoId = request.getParameter("id");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        DuenoController controller = new DuenoController();
        Dueno dueno = controller.obtenerDuenoById(id);
        HttpSession session = request.getSession();
        session.setAttribute("listaDuenoId",dueno);
        response.sendRedirect("mostrarDuenoId.jsp");
    }
}
