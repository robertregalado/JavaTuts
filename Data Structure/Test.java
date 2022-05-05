public class Test {
    public void pupAge() {
        int age = 0;
       
        age = age + 7;
        
        System.out.println("Puppy age is : " + age);
        
   }
   public void pupAge1() {
       
        int age1 = 0;
        int mul = 2;
       
        age1 = mul + 9;
      
        System.out.println("Puppy age is : " + age1);

   }
    public static void main(String args[]) {
      Test test = new Test();
      test.pupAge();

      Test test1 = new Test();
      test1.pupAge1();
    }


}
