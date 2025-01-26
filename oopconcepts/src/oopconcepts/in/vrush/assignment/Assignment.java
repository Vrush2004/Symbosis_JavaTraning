package oopconcepts.in.vrush.assignment;

public class Assignment {
	private int var1;
	private int var2;
	
	public Assignment() {}
	
	public Assignment(int var1, int var2) {
		this.var1 = var1;
		this.var2 = var2;
	}
	
	public void setVar1(int var1) {
		this.var1 = var1;
	}
	
	public void setVar2(int var2) {
		this.var2 = var2;
	}
	
	public int getVar1() {
		return var1;
	}
	
	public int getVar2() {
		return var2;
	}
	
	@Override
	public String toString() {
		return "Var1 : " + var1 + " " + "Var2 : " + var2;
	}
}