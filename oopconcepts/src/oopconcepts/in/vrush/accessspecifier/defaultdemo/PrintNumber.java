package oopconcepts.in.vrush.accessspecifier.defaultdemo;

public class PrintNumber {
	private int num;
	
	public PrintNumber() {}
	
	public PrintNumber(int num) {
		this.num = num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}
