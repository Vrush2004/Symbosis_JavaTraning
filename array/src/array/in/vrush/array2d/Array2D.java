package array.in.vrush.array2d;

import java.util.Arrays;

public class Array2D {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
//		int[][] arr2d = {{1,2,3},{4,5,6},{7,8,9}};
		
		arr[0] = new int[] {1,2};
		arr[1] = new int[] {1,2,3};
		arr[2] = new int[] {1,2,3,4,5};
		
		System.out.println(Arrays.deepToString(arr));
		
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j] +" ");
			}
		}
		System.out.println();
		
		for(int[] row:arr) {
			for(int col:row)
				System.out.print(col+" ");
			System.out.println(row);
		}
	}
}
