package assignment.solution;

import java.util.Scanner;

public class ThirdLargestNum {

	private static Scanner sc = new Scanner(System.in);

	public static void acceptElements(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the value for arr[" + i + "]  :  ");
			arr[i] = sc.nextInt();
		}
	}

	// method to find out third Largest Number

	public static void thirdLargestNumFinder(int arr[]) {

		int large = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (large < arr[i]) {
				large = arr[i];
			}
		}

		int secondLarge = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == large) {
				continue;
			} else {
				if (secondLarge < arr[i]) {
					secondLarge = arr[i];
				}
			}
		}

		int thirdLarge = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == large || arr[i] == secondLarge) {
				continue;
			} else {
				if (thirdLarge < arr[i]) {
					thirdLarge = arr[i];
				}
			}

		}

		System.out.println("Third largest Number Of The Array =  " + thirdLarge);

	}

	public static void main(String[] args) {

		System.out.print("Enter the length of the Array = ");
		int arr[] = new int[sc.nextInt()];

		acceptElements(arr);
		thirdLargestNumFinder(arr);

	}

}
