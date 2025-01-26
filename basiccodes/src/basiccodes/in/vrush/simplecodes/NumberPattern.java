package basiccodes.in.vrush.simplecodes;

public class NumberPattern {
	int limit;
	public NumberPattern(int limit) {
		this.limit = limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public int getLimit(int limit) {
		return limit;
	}
	
	public void printPyramid() {
		int num = 1;
		char ch = 'A';
		for(int r = 1; r<=limit; r++) {
			for(int s = 1; s <= limit-r ; s++) 
				System.out.print("\t");
			
			for(int c = 1; c<=(r*2-1) ; c++) {
//				System.out.print((r%2==0) ? (ch++ +"\t\t") : (num++ +"\t\t"));
//				System.out.print(num++ +"\t\t");
//				System.out.print("*" +"\t\t");
				if(r%2 == 0) {
					if(c%2 == 0)
						System.out.print(num++ +"\t");
					else
						System.out.print(ch++ +"\t");
				}
				else {
					if(c%2 == 0)
						System.out.print(ch++ +"\t");
					else
						System.out.print(num++ +"\t");
				}
			}
				
			System.out.println("\n");
		}
	}
	public static void main(String[] args) {
		NumberPattern obj = new NumberPattern(4);
		obj.printPyramid();
	}
}