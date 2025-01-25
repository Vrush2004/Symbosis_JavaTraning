package array.in.vrush.sort.bubblesort;

public class BubbleSort {
//	public void bubbleSort(int[] arr) {
//		for(int i=0; i<arr.length-1;i++) {
//			for(int j=0; j<arr.length; j++) {
//				if(arr[j] > arr[j+1]) {
//					arr[j] = arr[j] + arr[j+1];
//					arr[j+1] = arr[j] - arr[j+1];
//					arr[j] = arr[j] + arr[j+1];
//				}
//			}
//		}
//	}
	
	String[] stringArray;
	
	public String[] getStringArray() {
		return stringArray;
	}

	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}
	
	public BubbleSort(String[] stringArray) {
		this.stringArray = stringArray;
	}

	
	public BubbleSort() {
		
	}

	public void bubbleSort() {
		boolean isNotSwapped;
//		int flag;
		for(int i=0; i<stringArray.length-1;i++) {
//			flag=0;
			for(int j=0; j<stringArray.length-i-1;j++) {
				if(stringArray[j].compareTo(stringArray[j+1])>0){
					String temp = stringArray[j];
					stringArray[j] = stringArray[j+1];
					stringArray[j+1] = temp;
					isNotSwapped = true;
				}
				for(String name:stringArray) {
					System.out.print(name+ " ");
				}
				System.out.println();
				
//				if(flag ==0)
//					break;
			}
			if(!isNotSwapped) 
				break;
		}
	}
	
	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
//		int[] arr = {56, 26, 54, 10};
//		sort.bubbleSort(arr);
//		for (int num : arr) {
//			System.out.println(num +  " ");
//		}
		
		String[] names = {"Komal", "Nikita", "Poonam", "Mansi","Vrushali"};
		sort.setStringArray(names);
		System.out.println("Before Sorting: ");
		for(String name:names) {
			System.out.print(name+ " ");
		}
		System.out.println();
		sort.bubbleSort();
		
		System.out.println("After Sorting:");
		for(String name:names) {
			System.out.print(name+ " ");
		}
	}
}
