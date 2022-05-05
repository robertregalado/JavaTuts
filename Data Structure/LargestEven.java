public class LargestEven {
    public static void main(String[] args) {
        int[] numbers = { -20, 4, 46, -50, -8, 0 };
        
        // Finding the largest positive number
        int max = numbers[0];
        int index = -1;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2==0){
                if(numbers[i] > max){
                    max = numbers[i];
                    index = i;
                }
            } else{
                System.out.println("Nothing exists.");
            }
            
        }
        System.out.println(max + " at index " + index);
    }
    
}
