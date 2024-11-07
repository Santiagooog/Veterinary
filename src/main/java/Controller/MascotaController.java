package Controller;

import Model.Dueno;
import Model.Mascota;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static persistencia.Conexion.getConnection;

public class MascotaController {

    public Mascota obtenerMascotaById(int id) {
        PreparedStatement ps;
        ResultSet rs;
        Mascota mascota = null;
        try {
            Connection con = getConnection();
            ps = con.prepareStatement("select * from mascota where id=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {

                String nombre = rs.getString("nombre");
                String raza = rs.getString("raza");
                int edad = rs.getInt("edad");
                int dueno_id = rs.getInt("dueno_id");
                int veterinario_id = rs.getInt("veterinario_id");
                mascota = new Mascota(id, nombre, raza, edad, dueno_id, veterinario_id);
                return mascota;

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return mascota;

    }
    public boolean insertarMascota(Mascota mascota) {


        PreparedStatement ps;
        ResultSet rs;
        try{
            Connection con = getConnection();

            String sql = "INSERT INTO `mascota`(`nombre`, `raza`, `edad`, `dueno_id`, `veterinario_id`) VALUES (?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, mascota.getName());
            ps.setString(2,mascota.getBreed());
            ps.setInt(3,mascota.getAge());
            VeterinarioController vet = new VeterinarioController();
            DuenoController d = new DuenoController();
            if(vet.obtenerVeterinarioById(mascota.getIdVeterinario())==null ||d.obtenerDuenoById(mascota.getIdDueno())==null){
                throw new RuntimeException("No existe el veterinario o dueño, por favor verifique el id");
            }else{
            ps.setInt(4,mascota.getIdDueno());
            ps.setInt(5,mascota.getIdVeterinario());
            int rows = ps.executeUpdate();
            System.out.println("insertado "+rows);
                System.out.println("Filas afectadas "+rows);
                if(rows>0)
                    return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    public boolean eliminarMascota(int id) {
        PreparedStatement ps;
        ResultSet rs;
        try{
            Connection con = getConnection();
            String sql = "DELETE FROM `mascota` WHERE id=?";
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

    public boolean actualizarMascota(Mascota mascota,int id){
        PreparedStatement ps;
        ResultSet rs;
        try{
            Connection con = getConnection();

            String sql = "UPDATE `mascota` SET `nombre`=?,`raza`=?,`edad`=?,`dueno_id`=?,`veterinario_id`=? WHERE id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, mascota.getName());
            ps.setString(2,mascota.getBreed());
            ps.setInt(3,mascota.getAge());
            VeterinarioController vet = new VeterinarioController();
            DuenoController d = new DuenoController();
            if(vet.obtenerVeterinarioById(mascota.getIdVeterinario())==null ||d.obtenerDuenoById(mascota.getIdDueno())==null){
                throw new RuntimeException("No existe el veterinario o dueño, por favor verifique el id");
            }else{
                ps.setInt(4,mascota.getIdDueno());
                ps.setInt(5,mascota.getIdVeterinario());
                ps.setInt(6,id);
                int rows = ps.executeUpdate();
                System.out.println("Filas afectadas "+rows);
                if(rows>0)
                    return true;
                System.out.println("insertado "+rows);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public List<Mascota> obtenerMascotas(){
        PreparedStatement ps;
        ResultSet rs;
        List<Mascota> listaMascotas = new ArrayList<>();
        try {
            Connection con = getConnection();
            ps = con.prepareStatement("select * from mascota");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String raza = rs.getString("raza");
                int edad = rs.getInt("edad");
                int dueno_id = rs.getInt("dueno_id");
                int veterinario_id = rs.getInt("veterinario_id");

                Mascota mascota = new Mascota(id, nombre, raza, edad, dueno_id, veterinario_id);
                listaMascotas.add(mascota);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaMascotas;
    }
}
