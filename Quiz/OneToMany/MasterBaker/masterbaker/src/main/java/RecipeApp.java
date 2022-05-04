
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RecipeApp {
   
    private List<Recipe> recipes;

    RecipeApp(){
        recipes = new ArrayList<>();
    }
     
    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);

    }

    public List<String> getRecipes() {
        List<String> listRecipes = new ArrayList<>();
        for(Recipe recip: recipes){
            listRecipes.add(recip.toString());
        }
        return listRecipes;
    }

    public List<String> search(Recipe recipe) {
        List<String> ing = new ArrayList<>();
        for (Recipe r : recipes){
            if (recipe.equals(r)){
                    ing.add(r.toString());                
            }
        }
        //List<String> searchList = new ArrayList<String>(ing);
        return ing;
   
    }
}

class Recipe {
    private String name;
    List<Ingredient> ingredients;

    public Recipe(String name) {
        this.name = name;
        ingredients = new ArrayList<>();

    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);

    }

    public double getTotalCalories() {
        double totalCalories = 0;
        for (Ingredient ingredient:ingredients){
            totalCalories += ingredient.getCalories();
        }
        return totalCalories;
    }
}

class Ingredient {
    private String name;
    private double measurement;
    private int calories;

    public Ingredient(String name, double measurement, int calories) {
        this.name = name;
        this.measurement = measurement;
        this.calories = calories;
    }

    public double getMeasurement() {
        return measurement;
    }

    public void setMeasurement(double measurement) {
        this.measurement = measurement;
    }

    public double getCalories() {
        return calories*getMeasurement();
    }

    @Override
    public String toString() {
        return this.measurement + " cup of " + this.name;
    }
    
}
class Main<chocoCake> {
    public static void main(String[] args) {
        Ingredient flour = new Ingredient("All-purpose flour", 2, 437);
        Ingredient sugar = new Ingredient("Sugar", 2, 960);
        Ingredient cocoa = new Ingredient("Cocoa Powder", 0.75, 176);
        Ingredient bakingPowder = new Ingredient("Baking Powder", 0.042, 96);
        Ingredient bakingSoda = new Ingredient("Baking soda", 0.01, 0);
        Ingredient salt = new Ingredient("Salt", 0.021, 0);
        Ingredient milk = new Ingredient("Buttermilk", 1, 152);
        Ingredient oil = new Ingredient("Vegetable Oil", 0.5, 1840);
        Ingredient eggs = new Ingredient("Large Egg", 0.5, 232);
        Ingredient extract = new Ingredient("Vanilla Extract", 0.125, 592);
        Recipe chocoCake= new Recipe("Chocolate Cake");

        RecipeApp app = new RecipeApp();
        app.addRecipe(chocoCake);


        //milk.setMeasurement(1.5);
        //System.out.println(milk.getMeasurement());
        //System.out.println(milk.getCalories());
        System.out.println(chocoCake.getTotalCalories());


    }


}
