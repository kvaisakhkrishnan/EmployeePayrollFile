import java.sql.Array;
import java.util.ArrayList;

public class EmployeeList {
    ArrayList<EmployeePayroll> employeePayroll;
    public EmployeeList(){
        employeePayroll = new ArrayList<EmployeePayroll>();
    }
    public void addEmployee(){
        this.employeePayroll.add(new EmployeePayroll());
        System.out.println(this.employeePayroll.get(this.employeePayroll.size() - 1).toString());
    }
}
