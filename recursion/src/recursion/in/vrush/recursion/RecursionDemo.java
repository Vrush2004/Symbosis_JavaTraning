package recursion.in.vrush.recursion;

public class RecursionDemo {
	private int var;

	public RecursionDemo() {}

	public int getVar() {
		return var;
	}

	public RecursionDemo(int var) {
		this.var = var;
	}

	public void setVar(int var) {
		this.var = var;
	}
	
	public void printVariable(int no) {
		if(--no > 0) {
			printVariable(no);
		}
		System.out.println(no);
	}

	@Override
	public String toString() {
		return "RecursionDemo [var=" + var + "]";
	}
}