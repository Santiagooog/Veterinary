package Model;

public class Mascota {
    private int id;
    private String name;
    private String breed;
    private int age;
    private int idDueno;
    private int idVeterinario;

    public Mascota() {
    }

    public Mascota(int id, String name, String breed, int age, int idDueno, int idVeterinario) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.idDueno = idDueno;
        this.idVeterinario = idVeterinario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdDueno() {
        return idDueno;
    }

    public void setIdDueno(int idDueno) {
        this.idDueno = idDueno;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }
}
