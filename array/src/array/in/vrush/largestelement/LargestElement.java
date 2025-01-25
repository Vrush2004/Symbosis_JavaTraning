package array.in.vrush.largestelement;

public class LargestElement {
	public void largestElement(int[] arr) {
		int temp = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(temp < arr[i])
				temp = arr[i];
		}
		System.out.println(temp);
	}
}
