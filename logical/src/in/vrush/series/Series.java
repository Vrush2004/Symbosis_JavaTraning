package in.vrush.series;

public class Series {
	
	int limit;
	char ch1 = 'A';
	
	Series(){}
	
	Series(int limit){
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	
	public void printFibonacciSeries() {
		int number1 =0 ;
		int number2 = 1;
		int sum = 0;
		
		System.out.println("0 1");
		for(int i=0;i<limit-2;i++) {
			sum = number1+number2;
			
			number1 = number2;
			number2 = sum;
			
			System.out.println(sum+" ");
		}
	}
	
	public void printqubeSqureSeries() {
		for (int i=1;i<limit;i++) {
			if(i%2==0) {
				System.out.println(i*i+" ");
			}else {
				System.out.println(i*i*i+" ");
			}
		}
	}
	
	public void printNewSeries() {
		for (int i=1;i<limit;i+=2) {
				int temp = 0;
				temp = i+4;
				System.out.print(i+" "+temp+" ");
				temp =0;
			
		}
	}
	
	public void printNewSeries2() {
		char ch = 'A';
		for (int i=1;i<limit-3;i++,ch+=2) {
				char temp = 'A';
				temp = (char) (ch+4);
				System.out.print(ch+" "+temp+" ");
				temp =0;
			
		}
	}

}
