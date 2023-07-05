
import java.nio.file.Paths;
import java.util.Scanner;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 498105c862e600fc03f788af25c3cea9050b6215

public class NumbersFromAFile {

    public static void main(String[] args) {
<<<<<<< HEAD
        
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        // we create a scanner for reading the file
        try ( Scanner sc = new Scanner(Paths.get(file))) {

            // we read all the lines of the file
            while (sc.hasNextLine()) {
                list.add(sc.nextLine());
            }
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        int count = 0;
        for (String lt : list) {
            if(Integer.valueOf(lt) >= lowerBound && Integer.valueOf(lt) <= upperBound) {
                count++;
            }
            
        }
        System.out.println("Numbers: " + count);
=======
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

>>>>>>> 498105c862e600fc03f788af25c3cea9050b6215
    }

}
