package Servlets;

import Controller.VeterinarioController;
import Model.Veterinario;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "vet-id", value = "/vet-id")
public class SvVeterinarioId extends HttpServlet {

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            String veterinarioId = request.getParameter("id");

        }

        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
            int id = Integer.parseInt(request.getParameter("id"));
            VeterinarioController controller = new VeterinarioController();
            Veterinario vet = controller.obtenerVeterinarioById(id);
            HttpSession session = request.getSession();
            session.setAttribute("listaVetId",vet);
            response.sendRedirect("mostrarVeterinarioId.jsp");
        }

}
