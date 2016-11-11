public class Student extends Person {

    public Student() {
        type = "student";
    }

    @Override
    public void hello() {
        System.out.println("I'm a student");
    }
}