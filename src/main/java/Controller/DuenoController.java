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

public class DuenoController {

    public Dueno obtenerDuenoById(int id) {
        PreparedStatement ps;
        ResultSet rs;
        Dueno dueno = null;
        try {
            Connection con = getConnection();
            ps = con.prepareStatement("select * from dueno where id=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {

                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                dueno = new Dueno(id, nombre, edad, direccion, telefono, email);
                return dueno;

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dueno;

    }
    public boolean insertarDueno(Dueno dueno) {
        PreparedStatement ps;
        ResultSet rs;
        try{
            Connection con = getConnection();

            String sql = "INSERT INTO `dueno`(`nombre`, `edad`, `direccion`, `telefono`, `email`) VALUES (?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, dueno.getName());
            ps.setInt(2,dueno.getAge());
            ps.setString(3,dueno.getAdress());
            ps.setString(4,dueno.getPhone());
            ps.setString(5,dueno.getEmail());
            int rows = ps.executeUpdate();
            System.out.println("insertado "+rows);
            System.out.println("Filas afectadas "+rows);
            if(rows>0)
                return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    public boolean eliminarDueno(int id) {
        PreparedStatement ps;
        ResultSet rs;
        try{
            Connection con = getConnection();
            String sql = "DELETE FROM `dueno` WHERE id=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            int rows = ps.executeUpdate();
            System.out.println("Filas eliminadas "+rows);
            System.out.println("Filas afectadas "+rows);
            if(rows>0)
                return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean actualizarDueno(Dueno dueno,int id){
        PreparedStatement ps;
        ResultSet rs;
        try{
            Connection con = getConnection();

            String sql = "UPDATE `dueno` SET `nombre`=?,`edad`=?,`direccion`=?,`telefono`=?,`email`=? WHERE id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, dueno.getName());
            ps.setInt(2,dueno.getAge());
            ps.setString(3,dueno.getAdress());
            ps.setString(4,dueno.getPhone());
            ps.setString(5,dueno.getEmail());
            ps.setInt(6,id);
            int rows = ps.executeUpdate();
            System.out.println("Filas afectadas "+rows);
            System.out.println("Filas afectadas "+rows);
            if(rows>0)
                return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
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
