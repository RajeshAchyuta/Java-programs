Create a Java application where we have to create a user defined class like
employee, it contains variables like empid, empname and empsalary with
parameterized constructor, setter and getter methods then we have to
create object of any map then we have to add n no. of emp details and
manager ID values into map object then display all employees details in
descending order based on emp salary.
import java.util.*;
class Employee {

    private int empid;
    private String empname;
    private int empsal;

    Employee(int empid, String empname, int empsal) {
        this.empid = empid;
        this.empname = empname;
        this.empsal = empsal;
    }

    int getEmpid() {
        return empid;
    }

    String getEmpname() {
        return empname;
    }

    int getEmpsal() {
        return empsal;
    }
}

class SalaryComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e2.getEmpsal() - e1.getEmpsal(); // descending order
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<Integer, Employee> map = new HashMap<>();

        System.out.println("Enter number of employees:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter empId, name, salary, managerId:");

            int id = sc.nextInt();
            String name = sc.next();
            int sal = sc.nextInt();
            int managerId = sc.nextInt();

            map.put(managerId, new Employee(id, name, sal));
        }

                List<Employee> list = new ArrayList<>(map.values());

                Collections.sort(list, new SalaryComparator());

        
        System.out.println("\nEmployees sorted by salary (Descending):");
        for (Employee e : list) {
            System.out.println(
                e.getEmpid() + " " +
                e.getEmpname() + " " +
                e.getEmpsal()
            );
        }
    }
}