package model;

public class Nurse extends User{

    private String speciality;

    /**
     * Constructor de la clase model.User
     *
     * @param name  nombre del usuario
     * @param email correo del usuario
     */
    public Nurse(String name, String email) {
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
