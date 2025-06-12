import java.io.*;
import java.util.Scanner;

public class SimpleEmployeeCRUD {
    public static void main(String[] args) throws IOException {
        String filename = "employees.txt";
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.println("\n1. Add 2. View 3. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer
            
            if(choice == 1) {
                // Add employee
                System.out.print("Enter employee details (name,id,dept): ");
                String details = sc.nextLine();
                
                FileWriter fw = new FileWriter(filename, true);
                fw.write(details + "\n");
                fw.close();
            }
            else if(choice == 2) {
                // View all
                BufferedReader br = new BufferedReader(new FileReader(filename));
                String line;
                while((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            }
            else if(choice == 3) {
                break;
            }
        }
    }
}
