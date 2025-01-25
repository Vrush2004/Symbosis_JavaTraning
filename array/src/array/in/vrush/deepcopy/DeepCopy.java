package array.in.vrush.deepcopy;

import java.util.Arrays;

public class DeepCopy {
	public void copyEachElement(int[] srcArray) {
		int[] desArray = new int[srcArray.length];
		for(int i=0; i<srcArray.length; i++)
			desArray[i] = srcArray[i];
		
		System.out.println("Source Array: ");
		for(int num : srcArray)
			System.out.print(num+ " ");
		
		System.out.println();
		desArray[0] = 111;
		System.out.println("Destination Array: ");
		System.out.println(Arrays.toString(desArray));
	}
	
	public void shalowCopy(int[] srcArray) {
		srcArray[0] = 101;
	}
}