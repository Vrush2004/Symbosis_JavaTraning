package in.vrush.primenumber;

public class PrimeNumber {
	int number;
	
	public PrimeNumber() {} 
	public PrimeNumber(int number) {
		this.number = number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public boolean isPrimeNumber() {
		
		for(int i=2; i*i<= number/2 ; i++) {
			if(number%i == 0)
				return false;
		}
		return true;
	}
}
