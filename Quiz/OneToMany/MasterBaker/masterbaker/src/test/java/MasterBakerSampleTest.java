import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Before;
import org.junit.Test;


public class MasterBakerSampleTest {
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

    @Before
    public void set_up() {
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

    }

    @Test
    public void ___OO___DS___CS___SE___test_set_measurement() {
        milk.setMeasurement(1.5);
        assertEquals(1.5, milk.getMeasurement(), 0);
        assertEquals(228.0, milk.getCalories(), 0);
    }

    @Test
    public void ___OO___DS___CS___SE___test1_get_calories_per_ingredient() {
        assertEquals(874.0, flour.getCalories(), 0);
        assertEquals(1920, sugar.getCalories(), 0);
        assertEquals(132.0, cocoa.getCalories(), 0);
        assertEquals(4.03, bakingPowder.getCalories(), 10);
        assertEquals(0, bakingSoda.getCalories(), 0);
        assertEquals(0, salt.getCalories(), 0);
        assertEquals(152, milk.getCalories(), 0);
        assertEquals(920.0, oil.getCalories(), 0);
        assertEquals(116, eggs.getCalories(), 0);
        assertEquals(74.0, extract.getCalories(), 0);
    }

    @Test
    public void ___OO___DS___CS___SE___test2_get_total_calories_with_ingredients_added() {
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

        assertEquals(4192.03, chocoCake.getTotalCalories(), 10);
    }

    @Test
    public void ___OO___DS___CS___SE___test3_get_recipe_titles() {
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

        List<String> expected = new ArrayList<>(Arrays.asList("Chocolate Cake"));
        assertEquals(expected, app.getRecipes());
    }

    @Test
    public void ___OO___DS___CS___SE___test4_get_recipe_titles_new_recipe_added() {
        Ingredient yeast = new Ingredient("Yeast", 0.09, 624);
        Ingredient sugar = new Ingredient("Sugar", 0.25, 960);
        Ingredient water = new Ingredient("Warm water", 0.375, 0);
        Ingredient salt = new Ingredient("Salt", 0.021, 0);
        Ingredient butter = new Ingredient("Unsalted Butter", 2, 1628);
        Ingredient milk = new Ingredient("Buttermilk", 2, 152);
        Ingredient flour = new Ingredient("All-purpose flour", 5, 437);
        Ingredient egg = new Ingredient("Large Egg", 0.25, 232);

        Recipe croissant = new Recipe("Homemade Croissant");

        croissant.addIngredient(yeast);
        croissant.addIngredient(sugar);
        croissant.addIngredient(water);
        croissant.addIngredient(salt);
        croissant.addIngredient(butter);
        croissant.addIngredient(milk);
        croissant.addIngredient(flour);
        croissant.addIngredient(egg);

        app.addRecipe(croissant);

        List<String> expected = new ArrayList<>(Arrays.asList("Chocolate Cake", "Homemade Croissant"));
        assertEquals(expected, app.getRecipes());
    }

    @Test
    public void ___OO___DS___CS___SE___test5_search() {
        Ingredient yeast = new Ingredient("Yeast", 0.09, 624);
        Ingredient sugar = new Ingredient("Sugar", 0.25, 960);
        Ingredient water = new Ingredient("Warm water", 0.375, 0);
        Ingredient salt = new Ingredient("Salt", 0.021, 0);
        Ingredient butter = new Ingredient("Unsalted Butter", 2, 1628);
        Ingredient milk = new Ingredient("Buttermilk", 2, 152);
        Ingredient flour = new Ingredient("All-purpose flour", 5, 437);
        Ingredient egg = new Ingredient("Large Egg", 0.25, 232);

        Recipe croissant = new Recipe("Homemade Croissant");

        croissant.addIngredient(yeast);
        croissant.addIngredient(sugar);
        croissant.addIngredient(water);
        croissant.addIngredient(salt);
        croissant.addIngredient(butter);
        croissant.addIngredient(milk);
        croissant.addIngredient(flour);
        croissant.addIngredient(egg);

        app.addRecipe(croissant);

        List<String> expected = new ArrayList<>(
                Arrays.asList("0.09 cup of yeast", "0.25 cup of sugar", "0.38 cup of warm water", "0.02 cup of salt",
                        "2.00 cups of unsalted butter", "2.00 cups of buttermilk", "5.00 cups of all-purpose flour", "0.25 cup of large egg"));
        assertEquals(expected, app.search(croissant));
    }
}