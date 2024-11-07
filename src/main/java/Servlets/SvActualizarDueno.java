package Servlets;

import Controller.DuenoController;
import Controller.VeterinarioController;
import Model.Dueno;
import Model.Veterinario;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "actu-dueno", value = "/actu-dueno")
public class SvActualizarDueno extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("actualizarDueno.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");
        Dueno dueno = new Dueno();
        dueno.setName(nombre);
        dueno.setAge(edad);
        dueno.setAdress(direccion);
        dueno.setPhone(telefono);
        dueno.setEmail(email);

        DuenoController due = new DuenoController();
        if(due.obtenerDuenoById(id)!=null){
            System.out.println("el id a actualizar existe");
            due.actualizarDueno(dueno,id);
        }else{
            System.out.println("El dueno no existe");
        }
        response.sendRedirect("login.jsp");
    }
}
