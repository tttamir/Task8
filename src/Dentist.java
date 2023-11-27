public class Dentist implements Heal{
    @Override
    public void healPeople() {
        System.out.println("Heal by dentist");
    }
    public String getDoctorType() {
        return "dantist";
    }
}
