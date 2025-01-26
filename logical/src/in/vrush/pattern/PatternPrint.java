package in.vrush.pattern;

public class PatternPrint {
	
	int number1;
	
	PatternPrint(int number1){
		this.number1 = number1;
	}

	public int getNumber1() {
		return number1;
	}
	
	
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	
	void numberPattern() {
		int temp = 1;
		
		for (int i = 0;i<this.number1;i++) {
			for(int k=0;k<number1-i;k++) {
				System.out.print(" ");
			}
			for(int j = 0;j<=i;j++) {
				
				System.out.print(temp++ + " ");
			}
			System.out.println();
		}
	}
	
	
	/*
     A 
    1 2 
   B C D 
  3 4 5 6 
 E F G H I 
	 * 
	 */
	void numberCharacterPattern() {
		int num = 1;char ch = 'A';
		
		for (int i = 0;i<this.number1;i++) {
			//System.out.println(ch);
			for(int k=0;k<number1-i;k++) {
				System.out.print(" ");
			}
			for(int j = 0;j<=i;j++) {
				
				
				
				System.out.print(((i%2==0)? ch++ +"":num++ )+ " ");
			}
			System.out.println();
		}
	}
	
	/*
	 1 
    A 2 
   3 B 4 
  C 5 D 6 
 7 E 8 F 9 
	 * 
	 */
	void numberCharacterPattern2() {
		int num = 1;char ch = 'A';
		
		for (int i = 0;i<this.number1;i++) {
			//System.out.println(ch);
			for(int k=0;k<number1-i;k++) {
				System.out.print(" ");
			}
			for(int j = 0;j<=i;j++) {
				
				if(i%2==0) {
					System.out.print(((j%2!=0)? ch++ + "":num++ )+ " ");
				}else {
					System.out.print(((j%2==0)? ch++ + "":num++ )+ " ");
				}
				
				
			}
			System.out.println();
		}
	}
	
	void numberCharacterPattern3() {
		int num = 1;char ch = 'A';
		
		//System.out.println(" ");
		for (int i = 0;i<this.number1;i++) {
			//System.out.println(ch);
			for(int k=0;k<number1-i;k++) {
				System.out.print(" ");
			}
			for(int j = 0;j<=(i*2)-1;j++) {
				
				if(i%2==0) {
					System.out.print(((j%2!=0)? ch++ + "":num++ )+ " ");
				}else {
					System.out.print(((j%2==0)? ch++ + "":num++ )+ " ");
				}
				
				
			}
			System.out.println();
		}
	}
	
	
	

}
