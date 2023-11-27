import java.util.Scanner;

public class Therapist implements Heal{

    private Heal heal;

    Scanner sc = new Scanner(System.in);

    @Override
    public void healPeople() {
        System.out.println("Heal by therapist");
    }

    public Heal treatmentPlan1(int treatmentPlan){
        //System.out.print("vvedi plan lechenia [1, 2 ili drugoi] - ");

        if (treatmentPlan == 1) {
            return new Surgeon();
        } else if (treatmentPlan == 2) {
            return new Dentist();
        } else {
            return this;
        }
    }
    public String getDoctorType() {
        return "terapevt";
    }
}
