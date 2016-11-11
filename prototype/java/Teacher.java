public class Teacher extends Person {

    public Teacher() {
        type = "teacher";
    }

    @Override
    public void hello() {
        System.out.println("I'm a teacher");
    }
}