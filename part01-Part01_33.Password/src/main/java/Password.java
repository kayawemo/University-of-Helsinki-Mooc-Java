
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        String password = "Caput Draconis";
        String valu = "Wattlebird";
        
        System.out.println("Password?");
        String input = scan.nextLine();
        
        if (input.equals(password)) {
            System.out.println("Welcome!");
        } else if (input.equals(valu)) {
            System.out.println("Off with you!");
        }
    }
}
