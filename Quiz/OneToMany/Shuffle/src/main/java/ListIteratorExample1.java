import java.util.*;

public class ListIteratorExample1 {
    public static void main(String args[]){
        List<String> al=new ArrayList<String>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1,"Sachin");
        ListIterator<String> itr = al.listIterator();
        System.out.println("Traversing string elements in forward direction");
        while(itr.hasNext()){
            System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
        }
        System.out.println("Traversing string elements in backward direction");
        while(itr.hasPrevious()){
            System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
        }
        List<Integer> intVal = new ArrayList<Integer>();
        intVal.add(Integer.valueOf(10));
        intVal.add(Integer.valueOf(20));
        intVal.add(Integer.valueOf(28));
        intVal.add(1,Integer.valueOf(8));

        ListIterator<Integer> itrInteger = intVal.listIterator();
        //Traversing elements in forward direction
        System.out.println("");
        System.out.println("==================================================");
        System.out.println("Traversing integer elements in forward direction");
        while(itrInteger.hasNext()){
            System.out.println("Index: " + itrInteger.nextIndex() + " value: " + itrInteger.next());
        }

        //Traversing elements in backward direction
        System.out.println("");
        System.out.println("===Traversing integer elements in backward direction====");
        while(itrInteger.hasPrevious()){
            System.out.println("Index: " + itrInteger.previousIndex() + " value: " + itrInteger.previous());
        }

    }
}
