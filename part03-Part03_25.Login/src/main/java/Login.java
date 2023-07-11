
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String alexUsername = "alex";
        String alexPassword = "sunshine";
        
        String emmaxUsername = "emma";
        String emmaPassword = "haskell";
        
        System.out.println("Enter usrname:");
        System.out.println("Enter password");
        
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        
        if(username.equals(alexUsername) && password.equals(alexPassword) || username.equals(emmaxUsername) && password.equals(emmaPassword) ){
            System.out.println("You have successfully logged in!");
        }


    }
}
