import java.util.ArrayList;

public class Recipes {

    private ArrayList<Recipe> recipes;

    public Recipes() {
        this.recipes = new ArrayList<Recipe>();
    }


    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void printByName(String name) {

        if (this.recipes.isEmpty()) {

            System.out.println("None found");
        } else {
            for (Recipe e : this.recipes) {

                //lowercases both so regradless of case
                if (e.getName().toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(e);

                }

            }

        }

    }

    public void printByTime(String time) {

        if (this.recipes.isEmpty()) {

            System.out.println("None found");
        } else {
            for (Recipe e : this.recipes) {

                //lower caseing both so it finds it regradless of case
                if (e.getCookingTime() <= Integer.valueOf(time)) {

                    System.out.println(e);

                }

            }

        }

    }

    public void printByIngredient(String ingredient) {

        if (this.recipes.isEmpty()) {

            System.out.println("None found");
        } else {
            for (Recipe e : this.recipes) {

                //lower caseing both so it finds it regradless of case
                if (e.getIngredients().contains(ingredient.toLowerCase())) {

                    System.out.println(e);

                }

            }

        }

    }

    public void printRecipeBook() {

        for (Recipe e : this.recipes) {
            System.out.println(e);

        }

    }


}
