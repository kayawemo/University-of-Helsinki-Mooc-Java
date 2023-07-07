import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private RecipeList recipes;

    public UserInterface(Scanner scanner, RecipeList recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void run() {

        //takes file name form te user.
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        scanner = new Scanner(System.in);
        System.out.println();

        Path filePath = Paths.get(file);

        if (!Files.exists(filePath)) {
            System.out.println("File not found!");
            return;
        }

        commandInformation();

        while (true) {

            System.out.print("Enter command:");
            scanner = new Scanner(System.in);
            String commands = scanner.nextLine();
            System.out.println();

            if (commands.equals("stop")) break;
            if (commands.equals("list")) {

                userInput(file);
            }

            if (commands.equals("find name")) {
                findName();
            }
        }
    }

    private void findName() {
        System.out.print("Searched word: ");
        Scanner sci = new Scanner(System.in);
        String name = sci.nextLine();
        Recipe searchedRecipe = (recipes.searchRecipeByName(name));
        System.out.println(searchedRecipe.getName() + ", cooking time: " + searchedRecipe.getCookingTime());
        System.out.println();
    }

    private void userInput(String fileName) {

        try {
            scanner = new Scanner(Paths.get(fileName));
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int cookingTime = Integer.parseInt(scanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break; // End of ingredients for this recipe
                    }
                    recipes.addIngredients(ingredient);
                }

                Recipe recipe = new Recipe(name, cookingTime, ingredients);
                recipes.addRecipe(recipe);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void commandInformation() {
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stops - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println();
    }
//    private Recipe searchRecipe(String searched) {
//        System.out.println("Recipes:");
//        for (Recipe recipe : recipes) {
//            if (recipe.getName().contains(searched)) {
//                return recipe;
//            }
//
//        }
//        return null;
//    }


}
