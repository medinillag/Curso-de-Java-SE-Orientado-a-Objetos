import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatra");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient.getName());
        System.out.println(patient.getEmail());

        patient.setWeight(60.5);
        patient.setHeight(1.65);

        System.out.println(patient.getWeight());
        System.out.println(patient.getHeight());
    }
}
