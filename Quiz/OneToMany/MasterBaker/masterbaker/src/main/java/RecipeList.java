import java.util.ArrayList;
import java.util.List;

public class RecipeList {
    public static void main(String[] args) {
        
    }
    
}
class Recipe {
    private String name;
    public Object ingredients;
    
    Recipe(String name){
        this.name = name;
    }

    public void addIngredient(Ingredient flour) {
    }
    
}
class IngredientsList {
    ArrayList<Recipe> recipes = new ArrayList<Recipe>();
    
    Recipe chocoCake = new Recipe("Homemade Choco Cake");

    recipes.add(chocoCake);
}
