package array.in.vrush.search.linearsearch;

public class LinearSearch {
	public void linearsearch(int[] arr) {
		int temp = 10;
		for(int i=0; i<arr.length; i++) {
			if(temp == arr[i])
				System.out.println("Number present in array : " + temp);
		}	
	}
}
