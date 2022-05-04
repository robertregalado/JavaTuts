public class AccessDataElement {
    public static void main(String[] args) {
        Ingredient flour = new Ingredient();
        Ingredient sugar = new Ingredient();

        Recipe chocoCake = new Recipe("Chocolate Cake");
        chocoCake.addIngredient(flour);
        chocoCake.addIngredient(sugar);

        //System.out.println(flour.getCalories());
        //System.out.println(flour.getMeasurement());
        System.out.println(((Object) chocoCake.ingredients).get(1).getMeasurement());

    }
}
