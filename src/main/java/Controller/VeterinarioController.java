package Controller;

import Model.Dueno;
import Model.Veterinario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static persistencia.Conexion.getConnection;

public class VeterinarioController {

    public List<Veterinario> obtenerVeterinarios() {

        PreparedStatement ps;
        ResultSet rs;
        List<Veterinario> listaVeterinarios = new ArrayList<>();
        try {
            Connection con = getConnection();
            ps = con.prepareStatement("select * from veterinario");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String codigoProfesional = rs.getString("codigoProfesional");
                Veterinario vet = new Veterinario(id, nombre, edad, direccion, telefono, codigoProfesional);
                listaVeterinarios.add(vet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaVeterinarios;
    }

    public Veterinario obtenerVeterinarioById(int id) {
        PreparedStatement ps;
        ResultSet rs;
        Veterinario vet = null;
        try {
            Connection con = getConnection();
            ps = con.prepareStatement("select * from veterinario where id=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {

                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String codigoProfesional = rs.getString("codigoProfesional");
                vet = new Veterinario(id, nombre, edad, direccion, telefono, codigoProfesional);
                return vet;

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return vet;

    }
    public void insertarVeterinario(Veterinario vet) {
        PreparedStatement ps;
        ResultSet rs;
        try{
            Connection con = getConnection();

            String sql = "INSERT INTO `veterinario`(`nombre`, `edad`, `direccion`, `telefono`, `codigoProfesional`) VALUES (?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, vet.getName());
            ps.setInt(2,vet.getAge());
            ps.setString(3,vet.getAdress());
            ps.setString(4,vet.getPhone());
            ps.setString(5,vet.getCodigoProfesional());
            int rows = ps.executeUpdate();
            System.out.println("insertado "+rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void eliminarVeterinario(int id) {
        PreparedStatement ps;
        ResultSet rs;
        try{
            Connection con = getConnection();
            String sql = "DELETE FROM `veterinario` WHERE id=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            int rows = ps.executeUpdate();
            System.out.println("Filas eliminadas "+rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void actualizarVeterinario(Veterinario vet,int id){
        PreparedStatement ps;
        ResultSet rs;
        try{
            Connection con = getConnection();

            String sql = "UPDATE `veterinario` SET `nombre`=?,`edad`=?,`direccion`=?,`telefono`=?,`codigoProfesional`=? WHERE id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, vet.getName());
            ps.setInt(2,vet.getAge());
            ps.setString(3,vet.getAdress());
            ps.setString(4,vet.getPhone());
            ps.setString(5,vet.getCodigoProfesional());
            ps.setInt(6,id);
            int rows = ps.executeUpdate();
            System.out.println("Filas afectadas "+rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Dueno> obtenerDuenos(){
            PreparedStatement ps;
            ResultSet rs;
            List<Dueno> listaDuenos = new ArrayList<>();
            try {
                Connection con = getConnection();
                ps = con.prepareStatement("select * from dueno");
                rs = ps.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    int edad = rs.getInt("edad");
                    String direccion = rs.getString("direccion");
                    String telefono = rs.getString("telefono");
                    String email = rs.getString("email");
                    Dueno dueno = new Dueno(id, nombre, edad, direccion, telefono, email);
                    listaDuenos.add(dueno);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return listaDuenos;
    }
}