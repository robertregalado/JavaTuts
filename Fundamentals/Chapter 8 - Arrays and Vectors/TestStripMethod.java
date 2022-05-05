public class TestStripMethod {
   // Test driver for the strip() method 

   static String strip(String s, char c)
   { int n = s.length();
     char[] a = new char[n];
     int i = 0;
     int j = 0;
     while (i + j < n)
     { char sc = s.charAt(i+j); // i = j is the current index in s
        if (sc == c) j++;       // j is the number of characters removed
        else a[i++] = sc;       // characters have been copied into a 
    }
    return new String(a, 0, i); // duplicates a as a String object

    }

    public static void main(String[] args) 
    { String s = new String("ABCAAADEAFA");
      System.out.println(s);
      s = strip(s, 'A');
      System.out.println(s);
        
    }
}
