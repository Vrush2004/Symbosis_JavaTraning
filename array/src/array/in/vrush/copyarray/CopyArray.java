package array.in.vrush.copyarray;

import java.util.Arrays;

public class CopyArray {
    int arr1[];
    int arr2[];

    public int[] getArr1() {
        return arr1;
    }

    public void setArr1(int[] arr1) {
        this.arr1 = arr1;
    }

    public int[] getArr2() {
        return arr2;
    }

    public void setArr2(int[] arr2) {
        this.arr2 = arr2;
    }

    public CopyArray(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public CopyArray() {}

    public int[] copyArray() {
        int[] resultArray = new int[arr1.length + arr2.length];
        int r = 0;
        for (int f = 0; f < arr1.length; f++) { 
            resultArray[r++] = arr1[f];
        }
        for (int s = 0; s < arr2.length; s++) { 
            resultArray[r++] = arr2[s];        
        }
        return resultArray;
    }

    public int[] copyFirstHalfAndSecHalfArr() {
        int midFirst = arr1.length / 2; 
        int midSecond = arr2.length / 2;
        int[] result = new int[midFirst + midSecond + 2];
        int r = 0;
        for (int f = 0; f <= midFirst; f++) {
            result[r++] = arr1[f];
        }
        for (int s = midSecond; s < arr2.length; s++) {
            result[r++] = arr2[s]; 
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 9, 11, 50};
        int[] arr2 = {4, 9, 10};
        CopyArray copy = new CopyArray();
        copy.setArr1(arr1);
        copy.setArr2(arr2);

        // Test methods
        // int[] result = copy.copyArray();
        int[] result = copy.copyFirstHalfAndSecHalfArr();
        System.out.println(Arrays.toString(result));
    }
}
