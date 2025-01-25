package array.in.vrush.shalowcopy;

public class ShalowCopy {
	int var;

	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}

	public ShalowCopy(int var) {
		this.var = var;
	}

	public ShalowCopy() {}
	
	public static void main(String[] args) {
		ShalowCopy copy = new ShalowCopy();
		copy.setVar(100);
		System.out.println(copy.getVar());
		
		copyObject(copy);
		System.out.println(copy.getVar());
	}
	
	public static void copyObject(ShalowCopy copy1) {
		copy1.setVar(200);
	}
	
}
