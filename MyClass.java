import java.util.ArrayList;
import java.util.List;

class Employee{

    private int id;
    private double salary;
    private String name;

    Employee(int id, String name, double salary){
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public void displayDetails(){
        System.err.println("Id: " + id + " Name: "+ name+ " Salary: "+salary);
    }
}

public class MyClass {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100, "levi",14000);
        Employee emp2 = new Employee(101, "Eren", 15000);
        Employee emp3 = new Employee(1003, "Mikasa", 16000);

        List<Employee> employee = new ArrayList<>();
        employee.add(emp1);
        employee.add(emp3);
        employee.add(emp2);

        System.err.println("Employee details");
        for(Employee emp: employee){
            emp.displayDetails();
        }
    }
}