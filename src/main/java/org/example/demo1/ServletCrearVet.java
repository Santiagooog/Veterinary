package org.example.demo1;

import Controller.VeterinarioController;
import Model.Veterinario;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "crear-id", value = "/crear-vet")
public class ServletCrearVet extends HttpServlet {
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.sendRedirect("crearVet.jsp");
        }

        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

            String name = request.getParameter("nombre");
            int edad = Integer.parseInt(request.getParameter("edad"));
            String direccion = request.getParameter("direccion");
            String telefono = request.getParameter("telefono");
            String codigoProfesional = request.getParameter("codigoProfesional");
            Veterinario veterinario = new Veterinario();
            veterinario.setName(name);
            veterinario.setAge(edad);
            veterinario.setAdress(direccion);
            veterinario.setPhone(telefono);
            veterinario.setCodigoProfesional(codigoProfesional);
            VeterinarioController vet = new VeterinarioController();
            vet.insertarVeterinario(veterinario);


            response.sendRedirect("index.jsp");
        }
}
