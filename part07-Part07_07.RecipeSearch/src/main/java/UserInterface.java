import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Recipes recipes;

    public UserInterface(Scanner scanner, Recipes recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void start() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        System.out.println();

        printCommands();
        handleFile(fileName);

        while(true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
               recipes.printRecipeBook();
            }
        }


    }

    private void handleFile(String fileName) {

        try {
            Scanner fileScanner = new Scanner(Paths.get(fileName));

            while (fileScanner.hasNextLine()) {

                String name = scanner.nextLine();  // reads name from text file.
                int cookingTime = Integer.valueOf(scanner.nextLine()); // reads cooking time from text file.

                ArrayList<String> ingredients = new ArrayList<>(); // add the ingredient.
                while (fileScanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }

                Recipe recipe = new Recipe(name, cookingTime, ingredients);
                recipes.addRecipe(recipe);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printCommands() {

        System.out.println("Commands: \n list - lists the recipes" +
                "\n stop - stops the program \n");
    }

}
