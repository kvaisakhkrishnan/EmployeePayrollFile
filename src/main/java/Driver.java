import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class Driver {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
         employeeList.addEmployee();
//        checkFileExists("tempFile.txt");
//        checkFileExists("tempFile.txt");
//        deleteFile("noFile.txt");
//        deleteFile("tempFile.txt");
//        createDirectory("My Directory");
//        listFilesDirectory("/");
        employeeList.employeePayroll.get(0).calculatePayRoll("payroll.txt");
    }
    public static void checkFileExists(String fileName){
        Path path = Path.of(fileName);
        if(!Files.exists(path)){
            try{
                Files.createFile(path);
                System.out.println("File Created");
            }
            catch(Exception err){
                System.out.println("Caught Error " + err.getMessage());
            }
        }
        else{
            System.out.println("File Already Exists");
        }
    }

    public static void deleteFile(String fileName){
        try{
            Path path = Path.of(fileName);
            Files.delete(path);
            System.out.println("File Deleted");
        }catch(Exception err){
            System.out.println("Caught Error " + err.getMessage());
        }
    }
    public static void createDirectory(String directoryName){
        Path path = Path.of(directoryName);
        try{
            if(!Files.exists(path)){
                Files.createDirectory(path);
                System.out.println("Directory Created");
            }
            else{
                System.out.println("Directory Already Exists");
            }
        }
        catch(Exception err){
            System.out.println("Caught Error " + err.getMessage());
        }
    }
    public static void listFilesDirectory(String pathName){
       try{
           File f = new File(pathName);
           String[] list = f.list();
           for(String item : list){
               System.out.println(item);
           }


       }
       catch(Exception err){
           System.out.println("Caught Error " + err.getMessage());
       }
    }
}
