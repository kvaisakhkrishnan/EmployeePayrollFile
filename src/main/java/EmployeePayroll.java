import java.util.Scanner;

public class EmployeePayroll {
    @Override
    public String toString() {
        return "EmployeePayroll{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    String id;
    String name;
    int salary;
    public EmployeePayroll(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Id : ");
        this.id = scanner.nextLine();
        System.out.print("Enter Employee Name : ");
        this.name = scanner.nextLine();
        System.out.print("Enter Employee Salary : ");
        this.salary = scanner.nextInt();
    }
}
