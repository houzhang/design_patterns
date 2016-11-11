import java.util.Hashtable;

public class PersonCache {
    private static Hashtable<String, Person> personMap = new Hashtable<>();


    public static Person getPerson(String type) throws CloneNotSupportedException {
        Person cachedPerson = personMap.get(type);
        return (Person)cachedPerson.clone();
    }

    public static void loadCache() {
        Teacher teacher = new Teacher();
        personMap.put(teacher.getType(), teacher);

        Student student = new Student();
        personMap.put(student.getType(), student);
    }
}