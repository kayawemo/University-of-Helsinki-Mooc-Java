import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Recipes recipes = new Recipes();
        UserInterface ui = new UserInterface(scan, recipes);

        ui.start();
    }


}
