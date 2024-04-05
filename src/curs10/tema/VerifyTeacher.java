package curs10.tema;

public class VerifyTeacher {
    public static void main(String[] args) {
        
        Teacher teacher = new Qualification("Java", 4, "Afternoon");

        
        ((Qualification) teacher).verify();
    }
}