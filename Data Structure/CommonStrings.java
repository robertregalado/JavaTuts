public class CommonStrings {
    static void String_Character(){
        String s = "robertregalado";

        System.out.println(s.indexOf('t'));
    }
    public static void main(String args[]) {
        String[] words = {"funny", "chunky", "finance", "hardworking"};

        // calling method String_Character
        String_Character();
        // words starts with f using startsWith command
        for (String w : words){
            if (w.startsWith("f")){
                System.out.println(w + " starts with f");
            }
        }
        // endsWith
        for (String w : words){
            if (w.endsWith("y")){
                System.out.println(w + " ends with y");
            }
        }
        //String_Character();
    }
    
    
} 
