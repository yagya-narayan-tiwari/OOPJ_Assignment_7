package assignment.solution;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheArray {
	private static Scanner sc = new Scanner(System.in);

	public static void acceptElements(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the value for arr[" + i + "]  :  ");
			arr[i] = sc.nextInt();
		}
	}
	
	// to print elements
	
	public static void printElements(int arr[]) {

		System.out.println(Arrays.toString(arr));

		}
	
	
	// to reverse the array
	
	public static int [] reversedArray(int arr[]) {
		
		for(int i=0;i<arr.length/2;i++) {
			int temp =arr[i];
			arr[i]=arr[(arr.length-1)-i];
			arr[(arr.length-1)-i] = temp;
		}
		
		return arr;
	}
	
	
	// main method
	
	public static void main(String args[]) {
		System.out.print("Enter the length of the Array = ");
		int arr[] = new int[sc.nextInt()];
		
		acceptElements(arr);
		
		System.out.print("Array Before Reverse Operation =	");
		printElements(arr);
		
		// reversing method call
		
		reversedArray(arr);
		System.out.print("Array After Reverse Operation =	");
		printElements(arr);
		
	}
	
		
	
	
}
