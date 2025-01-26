package oopconcepts.in.vrush.accessspecifier.defaultdemo;

public class PrintString {
	private String str;
	
	public PrintString() {}
	
	public PrintString(String str) {
		this.str = str;
	}
	
	public void setNum(String str) {
		this.str = str;
	}
	
	public String getNum() {
		return str;
	}
}
