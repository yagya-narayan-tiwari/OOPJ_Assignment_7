package assignment.solution;

import java.util.*;

public class EqualToSum {
	private static Scanner sc = new Scanner(System.in);

	public static void acceptElements(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the value for arr[" + i + "]  :  ");
			arr[i] = sc.nextInt();
		}
	}

	public static void printNums(int arr[]) {
		System.out.print("Enter the Num :  ");
		int num = sc.nextInt();
		System.out.println("The numbers are :  ");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (num == (arr[i] + arr[j])) {
					System.out.println(arr[i] + " + " + arr[j] + " = " + num);
				}
			}
		}
	}

	public static void main(String[] args) {

		System.out.print("Enter the length of the array :  ");
		int arr[] = new int[sc.nextInt()];

		acceptElements(arr);

		printNums(arr);

	}

}
