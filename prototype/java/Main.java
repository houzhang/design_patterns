public class Main {

    public static void main(String[] args) {


        PersonCache.loadCache();

        try {
            Person cloneStudent = (Person) PersonCache.getPerson("student");
            cloneStudent.hello();

            Teacher cloneTeacher = (Teacher) PersonCache.getPerson("teacher");
            cloneTeacher.hello();
        } catch(CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }


    }
}