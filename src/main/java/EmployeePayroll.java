import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
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

    void calculatePayRoll(String filePath){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Full Working Hours: ");
        int full = scanner.nextInt();
        System.out.println("Enter Part Time Working Hours: ");
        int part = scanner.nextInt();
        this.salary = full * 20 + part * 10;
        Path path = Path.of(filePath);
        if(!Files.exists(path)){
            try{
                Files.createFile(path);
            }
            catch(Exception err){
                System.out.println("Error Caught " + err.getMessage());
            }

        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))){
            writer.write(this.id + ", " + this.name + ", " + this.salary);
            writer.newLine();}
        catch (Exception err){
            System.out.println("Error Caught " + err.getMessage());
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String data = reader.readLine();
            String[] array = data.split(",");
            if(array.length == 3){
                System.out.println("Succesfully Added Data");
            }
            else{
                System.out.println("Failed To Add Data");
            }
        }catch (Exception err){
            System.out.println("Error Caught " + err.getMessage());
        }
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
