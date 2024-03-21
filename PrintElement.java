package assignment.solution;

import java.util.*;

public class PrintElement {
	private static Scanner sc = new Scanner(System.in);

	public static void acceptElements(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the value for arr[" + i + "]  :  ");
			arr[i] = sc.nextInt();
		}
	}

	public static void printElements(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(" arr[" + i + "]: " + arr[i]);

		}
		System.out.println();

		System.out.println("Printing the Array using Arrays.toString property :) ");

		System.out.println("Array :  " + Arrays.toString(arr));
	}

	public static void main(String args[]) {
		System.out.println("Enter the length of the array :  ");
		int arr[] = new int[sc.nextInt()];

		acceptElements(arr);
		printElements(arr);

	}

}
