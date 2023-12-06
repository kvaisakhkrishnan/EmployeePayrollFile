import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

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
