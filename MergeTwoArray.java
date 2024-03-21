package assignment.solution;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
	
	private static Scanner sc = new Scanner(System.in);

	public static void acceptElements(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the value for arr[" + i + "]  :  ");
			arr[i] = sc.nextInt();
		}
	}
	
	
	// method to merge the arrays 
	
	public static int [] meregedArray(int [] arr1 , int [] arr2) {
		int i = 0;
		int j= 0;
		int k = 0;
		
		int [] mergedArr = new int [arr1.length + arr2.length];
		
		while(i< arr1.length && j< arr2.length) {
			mergedArr[k++] = arr1[i++];
			mergedArr[k++] = arr2[j++];
		}
		
		// arr1 k bache element 
		while(i < arr1.length) {
			mergedArr[k++] = arr1[i++];
		}
		
		// arr2 k bache element
		while(j < arr2.length) {
			mergedArr[k++] = arr2[j++];
		}
		
		return mergedArr;
	}

	// method to print merged array
	
	public static void printMergedArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter the length of the Array 1 = ");
		int arr1[] = new int[sc.nextInt()];
		acceptElements(arr1);
		
		System.out.print("Enter the length of the Array 2 = ");
		int arr2[] = new int[sc.nextInt()];
		acceptElements(arr2);
		
	    System.out.print("Merged Array =   ");
	    
	    printMergedArray(meregedArray(arr1 ,arr2));
	    
	    
		

	}

}
