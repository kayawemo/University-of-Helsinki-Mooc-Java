import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RecipeList recipes = new RecipeList();
        UserInterface ui = new UserInterface(scan, recipes);

        ui.run();
    }


}
