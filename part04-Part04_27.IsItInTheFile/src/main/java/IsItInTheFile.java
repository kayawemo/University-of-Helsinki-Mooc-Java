
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        
        boolean isFound = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
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

    }
}
