package Model;

public class Veterinario extends Persona {
    private String codigoProfesional;

    public Veterinario() {
    }

    public Veterinario(String codigoProfesional) {
        this.codigoProfesional = codigoProfesional;
    }

    public Veterinario(int id, String name, int age, String adress, String phone, String codigoProfesional) {
        super(id, name, age, adress, phone);
        this.codigoProfesional = codigoProfesional;
    }

    public String getCodigoProfesional() {
        return codigoProfesional;
    }

    public void setCodigoProfesional(String codigoProfesional) {
        this.codigoProfesional = codigoProfesional;
    }


    @Override
    public String toString() {
        return "Veterinario{" +
                "codigoProfesional='" + codigoProfesional + '\'' +
                '}';
    }
}
