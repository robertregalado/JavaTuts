public class Append {
    public static void main(String[] args) {
        String arr[] = {"ApPle", "BaNaNa", "CHERRY"};
        //String element = "mango";
        String arrNew[] = new String[arr.length];
        //nt i;
        for(int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i].toLowerCase();
        }
        //arrNew[i] = element;
        System.out.println(arrNew);

    }
    
}
