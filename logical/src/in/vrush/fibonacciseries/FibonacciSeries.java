package in.vrush.fibonacciseries;

public class FibonacciSeries {
	int limit;
	public FibonacciSeries() {}
	
	public FibonacciSeries(int limit) {
		this.limit = limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public int getLimit() {
		return limit;
	}
	
	public void printFibonacciSeries() {
		int n1 = 0;
		int n2 = 1;
		System.out.print("0 1 ");
		int sum = 0;
		for(int i=0; i<limit-2; i++) {
			sum = n1 + n2;
			System.out.print(sum + " ");
			n1 = n2;
			n2 = sum;
		}
		System.out.println();
	}
	
	public void printCubeSquareSeries() {
		for(int i=1; i<limit; i++) {
			if(i%2==0)
				System.out.print(i*i +" ");
			else
				System.out.print(i*i*i +" ");
		}
	}
	
	public void printNumber(int num) {
		int n1 = 1;
		for(int i=0; i<num; i++) {
			if(i%2 == 0) {
				System.out.print(n1+" ");
				n1+=4;
			}
			else {
				System.out.print(n1+" ");
				n1-=2;
			}
		}
	}
	
	public void printCharacter(int limit) {
		char ch = 'A';
		for(int i=0; i<limit; i++) {
			if(i%2 == 0) {
				System.out.print(ch+" ");
				ch+=4;
			}
			else {
				System.out.print(ch+" ");
				ch-=2;
			}
		}
	}
	
	public void numberPyramid(int limit) {
	    int num = 1;
	    for (int row = 1; row <= limit; row++) {
	        
	        for (int space = 1; space <= limit - row; space++) {
	            System.out.print("\t");
	        }
	        
	        for (int col = 1; col <= row; col++) {
	            if (col % 2 == 0) {
	                System.out.print((num * num *num) + "\t\t"); 
	            } else {
	                System.out.print((num * num) + "\t\t"); 
	            }
	            num++;
	        }
	        System.out.println("\n");
	    }
	}

}