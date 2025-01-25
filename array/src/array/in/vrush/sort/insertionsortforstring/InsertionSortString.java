package array.in.vrush.sort.insertionsortforstring;

public class InsertionSortString {
	String[] arr;

	public String[] getArr() {
		return arr;
	}

	public void setArr(String[] arr) {
		this.arr = arr;
	}

	public InsertionSortString() {}

	public InsertionSortString(String[] arr) {
		this.arr = arr;
	}
	
	public void insertionSort() {
		String key;
		int j;
		for(int i=0; i<arr.length; i++) {
			key = arr[i];
			j = i-1;
			while(j>=0 && arr[j].compareTo(key) > 0) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	public static void main(String[] args) {
		InsertionSortString sort = new InsertionSortString();
		String[] arrs = {"Vrush", "Mona", "Saku", "Palsi"};
		sort.setArr(arrs);
		System.out.println("Before Sorting: ");
		for(String arr:arrs) {
			System.out.print(arr+ " ");
		}
		System.out.println();
		sort.insertionSort();
		
		System.out.println("After Sorting:");
		for(String arr:arrs) {
			System.out.print(arr+ " ");
		}
	}
}
