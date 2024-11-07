package Servlets;

import Controller.VeterinarioController;
import Model.Veterinario;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "actu-vet", value = "/actu-vet")
public class SvActualizarVeterinario extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("actualizarVet.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        String codigoProfesional = request.getParameter("codigoProfesional");
        Veterinario veterinario = new Veterinario();
        veterinario.setName(nombre);
        veterinario.setAge(edad);
        veterinario.setAdress(direccion);
        veterinario.setPhone(telefono);
        veterinario.setCodigoProfesional(codigoProfesional);

        VeterinarioController vet = new VeterinarioController();
        if(vet.obtenerVeterinarioById(id)!=null){
            System.out.println("el id a actualizar existe");
            vet.actualizarVeterinario(veterinario,id);
        }else{
            System.out.println("El veterinario no existe");
        }
        response.sendRedirect("login.jsp");
    }

}
