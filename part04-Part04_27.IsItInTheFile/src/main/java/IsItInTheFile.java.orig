
import java.nio.file.Paths;
<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> 498105c862e600fc03f788af25c3cea9050b6215
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        
<<<<<<< HEAD
        boolean isFound = false;
=======
        ArrayList<String> lines = new ArrayList<>();
>>>>>>> 498105c862e600fc03f788af25c3cea9050b6215
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
<<<<<<< HEAD
        System.out.println("Searched for?");
        String searchedFor = scanner.nextLine();
        

        // we create a scanner for reading the file
        try ( Scanner sc = new Scanner(Paths.get(file))) {
            
            while(sc.hasNextLine()){
                String found = sc.nextLine();
                
                if (found.endsWith(searchedFor)){
                    isFound = true;
                }
            }
            
            if (isFound){
                System.out.println("Found!");
            } else{
                System.out.println("Not found.");
            }

            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

=======

        // we create a scanner for reading the file
        try ( Scanner sc = new Scanner(Paths.get("file.txt"))) {

            // we read all the lines of the file
            while (sc.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

>>>>>>> 498105c862e600fc03f788af25c3cea9050b6215
    }
}
