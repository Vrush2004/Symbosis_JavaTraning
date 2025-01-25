package array.in.vrush.deepcopy;

public class DeepCopyMain {
	public static void main(String[] args) {
		DeepCopy obj = new DeepCopy();
		int[] arr = {1,2,3};
		obj.copyEachElement(arr);
		obj.shalowCopy(arr);
	}
}
