package array.in.vrush.sort.selectionsortfornum;

public class SelectionSortWithNum {
	
	int[] intArray;
	
	public int[] getArray() {
		return intArray;
	}

	public void setIntArray(int[] intArray) {
		this.intArray = intArray;
	}
	
	public SelectionSortWithNum(int[] intArray) {
		this.intArray = intArray;
	}

	
	public SelectionSortWithNum() {}
	
	public void selectionSort() {
		int key;
		int temp;
		for(int i=0; i<intArray.length-1; i++) {
			
			key = i;
			for(int j=i+1; j<intArray.length; j++) {
				
				if(intArray[key] > intArray[j]) {
					key = j;
				}
				temp = intArray[i];
				intArray[i] = intArray[key];
				intArray[key] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		SelectionSortWithNum sort = new SelectionSortWithNum();
		int[] arrs = {5,2,4,3,1};
		sort.setIntArray(arrs);
		System.out.println("Before Sorting: ");
		for(int arr:arrs) {
			System.out.print(arr+ " ");
		}
		System.out.println();
		sort.selectionSort();
		
		System.out.println("After Sorting:");
		for(int arr:arrs) {
			System.out.print(arr+ " ");
		}
	}
}
