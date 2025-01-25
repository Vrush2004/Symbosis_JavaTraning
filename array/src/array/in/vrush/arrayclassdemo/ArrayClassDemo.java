package array.in.vrush.arrayclassdemo;

import java.util.Arrays;

public class ArrayClassDemo {
	public static void main(String[] args) {
		int[] arr = new int[5];
//		print(arr);
		
		Arrays.fill(arr, 1,4,3);
		
//		print(arr);
		print(6, "Vrush", 1,2,3,4,5,6);
	}
	
	public static void print(int length, String name, int... arr) {
		System.out.println(Arrays.toString(arr));
	}
}