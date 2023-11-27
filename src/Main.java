import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        Therapist therapist = new Therapist();

        System.out.print("vvedi plan lechenia [1, 2, ili drugoi] - ");
        int treatmentPlan = therapist.sc.nextInt();
        Heal heal = therapist.treatmentPlan1(treatmentPlan);

        Patient patient = new Patient();
        patient.setTreatmentPlan(treatmentPlan);
        if (treatmentPlan == 1) {
            patient.setDoctor("Хирург");
        } else if (treatmentPlan == 2) {
            patient.setDoctor("Стоматолог");
        } else {
            patient.setDoctor("Терапевт");
        }

        System.out.println("Plan lechenia: " + patient.getTreatmentPlan());
        System.out.println("Naznachenui vrach: " + patient.getDoctor());

    }
}