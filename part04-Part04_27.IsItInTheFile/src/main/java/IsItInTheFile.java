
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        
        ArrayList<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

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

    }
}
