class FruitsBasket {
    public static String[] reverse(String[] array){
        String[] result = new String[array.length];
        for(int i=0, j=result.length-1; i<array.length;
            i++, j--){
                result[j] = array[i];
            }
            return result;
    }
    public static void printArrayElements(String[] array) {
        for(String element:array){
            System.out.println(element);
        }
        
    }
    public static void main(String args[]) {
        String fruits[] = {"banana", "apple", "orange"}; 
        String[] newFruitsArray = reverse(fruits);

        for(String fruit:newFruitsArray){
            System.out.println(fruit);
        }
        for(String fruit:fruits) {
            System.out.println(fruit);
        }

    }
}

