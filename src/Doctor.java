public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    String name;
    String speciality;
    private String email;

    Doctor() {
        System.out.println("Construyendo el objeto doctor");
        id++;
    }

    Doctor(String name, String speciality) {
        id++;
        System.out.println("El nombre del doctor asignado es: " + name);
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }
}
