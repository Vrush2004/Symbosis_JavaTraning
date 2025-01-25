package array.in.vrush.sort.selectionsort;

public class SelectionSort {
	
	String[] stringArray;
	
	public String[] getStringArray() {
		return stringArray;
	}

	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}
	
	public SelectionSort(String[] stringArray) {
		this.stringArray = stringArray;
	}

	
	public SelectionSort() {}
	
	public void selectionSort() {
		int key;
		String temp;
		for(int i=0; i<stringArray.length; i++) {
			
			key = i;
			for(int j=i+1; j<stringArray.length; j++) {
				
				if(stringArray[key].compareTo(stringArray[j]) > 0) {
					key = j;
				}
			}
			temp = stringArray[i];
			stringArray[i] = stringArray[key];
			stringArray[key] = temp;
		}
	}
	
	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		String[] names = {"Komal", "Nikita", "Poonam", "Mansi","Vrushali"};
		sort.setStringArray(names);
		System.out.println("Before Sorting: ");
		for(String name:names) {
			System.out.print(name+ " ");
		}
		System.out.println();
		sort.selectionSort();
		
		System.out.println("After Sorting:");
		for(String name:names) {
			System.out.print(name+ " ");
		}
	}

}
