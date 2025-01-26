package basiccodes.in.vrush.simplecodes;

public class LargestAmongThree {

	int findLargest() {
		int n1 = 10;
		int n2 = 20;
		int n3 = 15;
		return((n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3 );
	}
	public static void main(String[] args) {
		LargestAmongThree obj = new LargestAmongThree();
		System.out.println("Largest Number: " + obj.findLargest());
	}
}