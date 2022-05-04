import java.util.ArrayList;
import java.util.List;

class RecipeApp {
    private List<Recipe> recipes;
    RecipeApp(){
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }

    public List<String> getRecipes(){
        List<String> listRecipes = new ArrayList<String>();
        for(Recipe recip: recipes){
            listRecipes.add(recip.toString());
        }
        return listRecipes;
    }

    public List<String> search(Recipe recipe){
        ArrayList<String> ing = new ArrayList<String>();
        for (Recipe r : recipes){
            if (recipe.equals(r)){
                    ing.add(r.toString());                
            }
        }
        List<String> searchList = new ArrayList<String>(ing);
        return searchList;
   
    }
    
}
class Recipe {
    private String name;
    List<Ingredient> ingredients;

    Recipe(String name){
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

    Ingredient(String name, double measurement, int calories){
        this.name = name;
        this.measurement = measurement;
        this.calories = calories;
    }
    
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return double return the measurement
     */
    public double getMeasurement() {
        return measurement;
    }

    /**
     * @param measurement the measurement to set
     */
    public void setMeasurement(double measurement) {
        this.measurement = measurement;
    }

    /**
     * @return int return the calories
     */
    public double getCalories() {
        return calories * getMeasurement();
    }

    /**
     * @param calories the calories to set
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return this.measurement + " cup of " + this.name;
    }
}

public class RecipeAppTest{
    public static void main(String[] args) {
        Ingredient flour;
        Ingredient sugar;
        Ingredient cocoa;
        Ingredient bakingPowder;
        Ingredient bakingSoda;
        Ingredient salt;
        Ingredient milk;
        Ingredient oil;
        Ingredient eggs;
        Ingredient extract;
        Recipe chocoCake;
        RecipeApp app;

        flour = new Ingredient("All-purpose flour", 2, 437);
        sugar = new Ingredient("Sugar", 2, 960);
        cocoa = new Ingredient("Cocoa Powder", 0.75, 176);
        bakingPowder = new Ingredient("Baking Powder", 0.042, 96);
        bakingSoda = new Ingredient("Baking soda", 0.01, 0);
        salt = new Ingredient("Salt", 0.021, 0);
        milk = new Ingredient("Buttermilk", 1, 152);
        oil = new Ingredient("Vegetable Oil", 0.5, 1840);
        eggs = new Ingredient("Large Egg", 0.5, 232);
        extract = new Ingredient("Vanilla Extract", 0.125, 592);

        chocoCake = new Recipe("Chocolate Cake");

        app = new RecipeApp();

        app.addRecipe(chocoCake);

        //milk.setMeasurement(1.5);
        //System.out.println(milk.getMeasurement());
        //System.out.println(milk.getCalories());

        chocoCake.addIngredient(flour);
        chocoCake.addIngredient(sugar);
        chocoCake.addIngredient(cocoa);
        chocoCake.addIngredient(bakingPowder);
        chocoCake.addIngredient(bakingSoda);
        chocoCake.addIngredient(salt);
        chocoCake.addIngredient(milk);
        chocoCake.addIngredient(oil);
        chocoCake.addIngredient(eggs);
        chocoCake.addIngredient(extract);

        //chocoCake.getTotalCalories();
        System.out.println(app.getRecipes());

        //System.out.println(chocoCake.getTotalCalories());

        Ingredient yeast = new Ingredient("Yeast", 0.09, 624);
        Ingredient sugar1 = new Ingredient("Sugar", 0.25, 960);
        Ingredient water = new Ingredient("Warm water", 0.375, 0);
        Ingredient salt1 = new Ingredient("Salt", 0.021, 0);
        Ingredient butter = new Ingredient("Unsalted Butter", 2, 1628);
        Ingredient milk1 = new Ingredient("Buttermilk", 2, 152);
        Ingredient flour1 = new Ingredient("All-purpose flour", 5, 437);
        Ingredient egg = new Ingredient("Large Egg", 0.25, 232);

        Recipe croissant = new Recipe("Homemade Croissant");
        

        croissant.addIngredient(yeast);
        croissant.addIngredient(sugar1);
        croissant.addIngredient(water);
        croissant.addIngredient(salt1);
        croissant.addIngredient(butter);
        croissant.addIngredient(milk1);
        croissant.addIngredient(flour1);
        croissant.addIngredient(egg);

        app.addRecipe(croissant);

        //System.out.println(app.getRecipes());
        //System.out.println(app.search(chocoCake));
        //System.out.println(croissant.ingredients);
        
    }
}
