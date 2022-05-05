public class SearchingForChars {
   public static void main(String[] args) {
       String str = "This is the Mississippi River.";
       System.out.println(str);
       int i = str.indexOf('s');
       System.out.println("The first index of 's' is " + i);
       int j = str.indexOf('s', i+1);
       System.out.println("The next index of 's' is " + j);
       int k = str.indexOf('s', j+1);
       System.out.println("The next index of 's' is " + k);
       k = str.lastIndexOf('s');
       System.out.println("The last index of 's' is " + k);
       System.out.println(str.substring(k));
   } 
}
