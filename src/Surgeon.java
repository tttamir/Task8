public class Surgeon implements Heal{
    //Хирург
    @Override
    public void healPeople() {
        System.out.println("Heal by surgeon");
    }
    public String getDoctorType() {
        return "hirurg";
    }
}
