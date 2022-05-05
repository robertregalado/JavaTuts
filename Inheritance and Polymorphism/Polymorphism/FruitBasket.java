import java.util.Arrays;
import java.util.List;

public class FruitBasket {
    List<Fruit> fruits;
    
    public FruitBasket(List<Fruit> fruits){
        this.fruits = fruits;
    }

    public void introduceFruits(){
        fruits.forEach(fruit -> fruit.sayName());
    }

    public static void main(String[] args) {
        Fruit mangofruit = new MangoFruit();
        Fruit orangefruit = new OrangeFruit();
        Fruit guavafruit = new GuavaFruit();
        Fruit fruits[] = { mangofruit, guavafruit, orangefruit};
        FruitBasket fruitBasket = new FruitBasket(Arrays.asList(fruits));
        fruitBasket.introduceFruits(); 

    }
}
