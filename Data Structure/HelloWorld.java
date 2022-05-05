public class HelloWorld {
    static void display(String... values) {
        System.out.println("display method invoked ");
        for(String s:values) {
           System.out.println(s);  
        }  
     } 
     public static void main(String args[]) { 
        display();
        display("Tutorialspoint");
        display("my","name","is","Sairamkrishna Mammahe");
     }  
    
}
