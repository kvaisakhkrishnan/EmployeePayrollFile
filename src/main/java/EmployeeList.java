import java.io.*;
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
    public void printPayroll(String filePath){
       Path path = Path.of(filePath);
       try{
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while(( line = reader.readLine()) != null){
                String[] array = line.split(",");
                if(array.length == 3){
                    System.out.println("Id: " + array[0] + ", Name: " + array[1] + ",Payroll: " + array[2]);
                }
                else{
                    System.out.println("Invalid Data");
                }
            }
       }
       catch(Exception err){
           System.out.println("Exception Caught " + err.getMessage());
       }
    }


}
