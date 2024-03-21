package assignment.solution;

import java.util.Scanner;

public class SmallestAndLargestNum {

	private static Scanner sc = new Scanner(System.in);

	public static void acceptElements(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the value for arr[" + i + "]  :  ");
			arr[i] = sc.nextInt();
		}
	}

	// method to get smallest and largest number 
	
	public static void SmallestAndLargestNumFinder(int arr[]) {
		int smallestNum = arr[0];
		int largestNum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (smallestNum > arr[i]) {
				smallestNum = arr[i];
			}
		}
		System.out.println("Smallest Number Of The Array =   " + smallestNum);

		for (int i = 1; i < arr.length; i++) {
			if (largestNum < arr[i]) {
				largestNum = arr[i];
			}
		}

		System.out.println("Largest Number Of The Array =   " + largestNum);

	}
	
	

	public static void main(String[] args) {

		System.out.print("Enter the length of the Array = ");
		int arr[] = new int[sc.nextInt()];
		
		acceptElements(arr);
		SmallestAndLargestNumFinder(arr);

	}

}
