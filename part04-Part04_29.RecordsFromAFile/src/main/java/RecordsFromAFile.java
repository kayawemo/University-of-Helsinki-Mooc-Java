
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Name of the fie:");
        String name = scanner.nextLine();

        // we create a scanner for reading the file
        try ( Scanner sc = new Scanner(Paths.get(name))) {
            
            while(sc.hasNextLine()) {
                String details = sc.nextLine();
                String detailsArray[] = details.split(",");
                System.out.println(detailsArray[0] + ", age: " + detailsArray[1] + " years" );
            }
            
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
