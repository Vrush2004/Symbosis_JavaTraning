package array.in.vrush.sort.insertionsort;

public class InsertionSort {
	
	int[] arr;
	
	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public InsertionSort(int[] arr) {
		this.arr = arr;
	}

	public InsertionSort() {}

	public void insertionSort() {
//		int j;
		for(int i=0; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			
		}
	}
	
	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		int[] arr = {6,2,1,4,0};
		sort.setArr(arr);
		
		System.out.println("Before Sorting: ");
		for(int a:arr) {
			System.out.print(a+ " ");
		}
		System.out.println();
		sort.insertionSort();
		
		System.out.println("After Sorting:");
		for(int a:arr) {
			System.out.print(a+ " ");
		}
	}
}
