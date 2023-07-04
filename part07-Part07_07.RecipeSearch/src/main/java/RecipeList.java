import java.util.ArrayList;

public class RecipeList {

    private ArrayList<Recipe> recipeList;

    public RecipeList() {
        this.recipeList = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipeList.add(recipe);
    }

    public Recipe searchRecipeByName(String name) {
        for (Recipe recipe : recipeList) {
            if(recipe.getName().contains(name)) {
                return recipe;
            }
        }
        return null;
    }

    public Recipe searchRecipeByTime(int time) {
        for (Recipe recipe : recipeList) {
            if(recipe.getCookingTime() == time) {
                return recipe;
            }
        }
        return null;
    }

    public Recipe searchRecipeByIngredient(String ingredient) {
        for (Recipe recipe : recipeList) {
            if(recipe.getIngredients().contains(ingredient)) {
                return recipe;
            }
        }
        return null;
    }
}
