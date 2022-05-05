class TestCharArrays
{ // Test the String.toCharArray() method and array access
    public static void main(String[] args) {
        String s = new String("ABCDEFG");
        char[] a = s.toCharArray();
        System.out.println("s = \"" + s + "\"\t\ta = \"" + a + "\"");
        System.out.println("s.length() = " + s.length()
                + "\t\ta.length = " + a.length);
        for (int i = 0; i < s.length(); i++)
            System.out.println("s.charAt(" + i + ") = " + s.charAt(i)
              + "t\ta[" + i + "] = " + a[i]);


    }
}
