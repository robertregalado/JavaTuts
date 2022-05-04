import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int pos;
        String[] stringArray = new String[array.length];
            for(pos = 0; pos < array.length; pos++){
            if(array[pos]==1) {
                stringArray[pos]= "One";
            }
            if(array[pos]==2) {
                stringArray[pos]= "Two";
            }
            if(array[pos]==3) {
                stringArray[pos]= "Three";
            }
            if(array[pos]==4) {
                stringArray[pos]= "Four";
            }
            if(array[pos]==5) {
                stringArray[pos]= "Five";
            }

        }

        System.out.println(Arrays.toString(stringArray));
        System.out.println("Printing the Integer List: " + integerValue());
        System.out.println("Printing the String List: " + stringValue());

    }

    public static List<Integer> integerValue(){
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(Integer.valueOf(10));
        integerList.add(Integer.valueOf(20));
        integerList.add(Integer.valueOf(30));
        return integerList;
    }


    public static List<String> stringValue(){
        List<String> stringList = new ArrayList<String>();
        stringList.add("Ten");
        stringList.add("Twenty");
        stringList.add("Thirty");
        return stringList;
    }

}
