import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "anahi@anahi.com");
        myDoctor.addAvailableAppointment(new Date(), "4PM");
        myDoctor.addAvailableAppointment(new Date(), "10PM");
        myDoctor.addAvailableAppointment(new Date(), "13PM");

        for (Doctor.AvailableAppointment aA :
                myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        patient.setWeight(60.5);
        patient.setHeight(1.65);

        Patient patient2 = new Patient("Anahí", "anahí@mail.com");

        System.out.println(patient2);
        System.out.println(myDoctor);

    }
}
