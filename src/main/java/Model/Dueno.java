package Model;

public class Dueno extends Persona{
    private String email;

    public Dueno() {
    }

    public Dueno(int id, String name, int age, String adress, String phone, String email) {
        super(id, name, age, adress, phone);
        this.email = email;
    }

    public Dueno(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
