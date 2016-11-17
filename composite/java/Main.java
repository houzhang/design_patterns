import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee ceo = new Employee("Houzhang", "CEO", 100000);

        Employee headFinance = new Employee("Shu", "Finance", 80000);
        Employee headSales = new Employee("Kate", "Head of Sales", 70000);
        Employee headIT = new Employee("Sophia", "Head of IT", 70000);

        Employee developer1 = new Employee("Charlie", "IT", 60000);
        Employee developer2 = new Employee("Pete", "IT", 60000);

        ceo.add(headFinance);
        ceo.add(headSales);
        ceo.add(headIT);

        headIT.add(developer1);
        headIT.add(developer2);

        System.out.println(ceo);
        printAllEmployee(ceo.getSubordinates());
    }

    public static void printAllEmployee(List<Employee> employeeList) {
        for (Employee employee: employeeList) {
            System.out.println(employee);
            printAllEmployee(employee.getSubordinates());
        }
    }
}