import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Robert","Male", "Single"));
        personList.add(new Person("John", "Male", "Married"));
        personList.add(new Person("Laura", "Female", "Married"));
        personList.add(new Person("Diana", "Female", "Single"));
        personList.add(new Person("Mike", "Male", "Single"));
        personList.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria remale = new CriteriaFemale();

        System.out.println("Male: " + male.meetCriteria(personList));
        System.out.println("Remale: " + remale.meetCriteria(personList));
    }
}