class Main1 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("hello");
    sb.deleteCharAt(0).insert(0, "H")." World!";
    System.out.println(sb);
  }
}