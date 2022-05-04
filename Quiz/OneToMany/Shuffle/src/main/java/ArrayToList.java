import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        //Creating an array
        String[] array = {"Python","Javascript","C++","Java"};
        System.out.println(Arrays.toString(array));

        //Converting the array into a list
        List<String> list = new ArrayList<String>();
        for(String lang: array){
            list.add(lang);
        }
        System.out.println("Printing the list: " + list);
        list.remove("Python");
        System.out.println("Python element was removed from the list: " + list);
        list.clear();
        System.out.println("List is empty using list.clear() command: " + list);
    }
}
