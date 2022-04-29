public class Swap {

	public static void main(String[] args) {
		int x=5,y=10;
		swapsies(x,y);
		System.out.println(x+" "+y);
	}

	static void swapsies(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
	}
}