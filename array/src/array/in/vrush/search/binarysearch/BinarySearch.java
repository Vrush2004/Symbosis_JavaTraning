package array.in.vrush.search.binarysearch;

public class BinarySearch {
	private int[] arr;
	private int key;
	
	public BinarySearch() {}
	
	public BinarySearch(int[] arr, int key) {
		this.arr = arr;
		this.key = key;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int linearSearch() {
		for(int i=0; i<arr.length; i++) {
			if(key==arr[i])
				return i;
		}
		return -1;
	}
	
	public int binarySearch() {
		int left = 0;
		int right = arr.length - 1;
		while(left <= right) {
			int mid = (right+left) /2;
			if(key == arr[mid]) {
				return mid;
			}
			else if(key >= arr[mid]) {
				left=mid+1;
			}
			else {
				right=mid;
			}
		}
		return -1;
	}

	
}