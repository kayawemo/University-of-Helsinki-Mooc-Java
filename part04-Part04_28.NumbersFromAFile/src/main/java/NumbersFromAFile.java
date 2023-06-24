
import java.nio.file.Paths;
import java.util.Scanner;

import java.util.ArrayList;


public class NumbersFromAFile {

    public static void main(String[] args) {

        
        
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

        


    }

}
