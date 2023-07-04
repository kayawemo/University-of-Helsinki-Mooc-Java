import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    String textFile = "recipes.txt";
    ArrayList<Recipe> recipes = new ArrayList<>();

    public void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        System.out.println();

        ArrayList<String> ingredients = new ArrayList<>();

        while (true) {

            commandInfo();


            Scanner sc = new Scanner(System.in);
            System.out.print("Enter command: ");


            String commands = sc.nextLine();
            System.out.println();
            if (commands.equals("stop")) break;

            if (commands.equals("list")) try {
                scanner = new Scanner(Paths.get(file));

                while (scanner.hasNextLine()) {
                    String name = scanner.nextLine();
                    int cookingTime = Integer.parseInt(scanner.nextLine());

                    // System.out.println(line); // for testing

                    while (scanner.hasNextLine()) {
                        String ingredient = scanner.nextLine();
                        if (ingredient.isEmpty()) {
                            break; // End of ingredients for this recipe
                        }
                        ingredients.add(ingredient);
                    }

                    Recipe recipe = new Recipe(name, cookingTime, ingredients);
                    recipes.add(recipe);
                }
                System.out.println();
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());

                }


            } catch (IOException e) {
                e.printStackTrace();
            }

            if (commands.equals("find name")){

                System.out.print("Searched word: ");
                Scanner sci = new Scanner(System.in);
                String name = sci.nextLine();
                Recipe searchedRecipe = (searchRecipe(name));
                System.out.println(searchedRecipe.getName() + ", cooking time: " + searchedRecipe.getCookingTime());
                System.out.println();
            }
        }
    }

    private void commandInfo() {
        //displays the options
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stops - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println();

    }

    private Recipe searchRecipe(String searched) {
        System.out.println("Recipes:");
        for(Recipe recipe : recipes) {
            if (recipe.getName().contains(searched)) {
                return recipe;
            }

        }
        return null;
    }


}
