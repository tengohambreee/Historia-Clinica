import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        // Crear pacientes
        Patient p1 = new Patient("Juan Pérez", 1, new Date(), false, 70.5, 1.75, "Calle Falsa 123");
        Patient p2 = new Patient("Ana López", 2, new Date(), true, 65.0, 1.68, "Avenida Siempre Viva");

        // Agregar pacientes al hospital
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Agregar condición médica a un paciente
        p1.addMedicalCondition(new MedicalCondition("Dengue", new Date(), "Reposo e hidratación"));

        // Probar métodos del hospital
        System.out.println("Pacientes ordenados por nombre:");
        for (Patient p : hospital.sortPatientsByName()) {
            System.out.println(p.getFullName());
        }

        System.out.println("Número de pacientes femeninas con Dengue: " + hospital.countFemalePatientsWithDengue());
    }
}

