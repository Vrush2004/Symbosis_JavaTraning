package array.in.vrush.search.binarysearch;

import java.util.Arrays;

public class MainBinarySearch {
	public static void main(String[] args) {
		BinarySearch search = new BinarySearch();
		int[] arr = {6,8,9,3,2,1};
		Arrays.sort(arr);
		search.setArr(arr);
		search.setKey(6);
		System.out.println("Using Binary Search :" +search.binarySearch());
		System.out.println("Using Linear Search :" +search.linearSearch());
	}
}