import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("Robert", 12354);
        empIds.put("Nida", 12256);
        empIds.put("Michaela", 12365);

        System.out.println(empIds);
        System.out.println(empIds.get("Robert"));
        System.out.println("Nida's ID No: " + empIds.get("Nida"));
        System.out.println(empIds.containsKey("Michaela"));
        
        System.out.println(empIds.containsValue(123));
  
        System.out.println(empIds.replace("Michaela", 12));

    }
}