package array.in.vrush.objectarray;
import java.util.Scanner;

public class MainStudentRecord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number of record to be stored? ");
		System.out.println(": ");
		int arraySize = sc.nextInt();
		Student[] studentArray = new Student[arraySize];
		
		System.out.println("Enter Student Record: ");
		int rollNo;
		String name;
		for(int i=0; i<arraySize; i++) {
			System.out.println("Enter Student" + (i+1) + " RollNo: ");
			rollNo = sc.nextInt();
			System.out.println("Enter Student" + (i+1) + " Name: ");
			sc.nextLine();
			name = sc.nextLine();
			studentArray[i] = new Student(rollNo, name);
		}
		
		for(int i=0; i<arraySize; i++) {
			System.out.println(studentArray[i].toString());
		}
		
		System.out.println("Enter a RollNo to find a record: ");
		int key = sc.nextInt();
		
		int result =  binarySearch(studentArray, key);
		if(result >=0) {
			System.out.println(studentArray[result]);
		}
		else {
			System.out.println("Record not found...");
		}
		
		sc.close();
	}
	
	public static int binarySearch(Student[] studentArray, int key) {
		int left = 0;
		int right = studentArray.length - 1;
		while(left <= right) {
			int mid = (right+left) /2;
			if(key == studentArray[mid].getRollNo()) {
				return mid;
			}
			else if(key >= studentArray[mid].getRollNo()) {
				left=mid+1;
			}
			else {
				right=mid;
			}
		}
		return -1;

	}
}
