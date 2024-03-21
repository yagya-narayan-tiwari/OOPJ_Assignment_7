package assignment.solution;

import java.util.Scanner;

public class IsAccendingDecendingArray {

	private static Scanner sc = new Scanner(System.in);

	public static void acceptElements(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the value for arr[" + i + "]  :  ");
			arr[i] = sc.nextInt();
		}
	}

	public static String isAscendingOrDescending(int[] arr) {
		boolean isAscending = true;
		boolean isDescending = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isAscending = false;
			} else if (arr[i] < arr[i + 1]) {
				isDescending = false;
				;
			}
		}

		if (isAscending) {
			return "Ascending";
		} else if (isDescending) {
			return "Descending";
		} else {
			return "Random";
		}

	}

	public static void main(String[] args) {

		System.out.print("Enter the length of the Array = ");
		int arr1[] = new int[sc.nextInt()];

		acceptElements(arr1);

		System.out.println("The Order of the Array is =  " + isAscendingOrDescending(arr1));

	}

}
