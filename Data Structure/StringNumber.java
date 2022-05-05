public class StringNumber {
    public static void main(String[] args) {
        
        int x[] = {2, 3, 4, 5, 6, 7, 8, 9};
         
        for(int i = 0; i < x.length; i++){
            if (i % 2 == 0){
            System.out.println(x[i]+" =>> is an even number");
            }
            else{
                System.out.println(x[i]+" =>> is an odd number");
            }
        }
        
    }
    
    
}
