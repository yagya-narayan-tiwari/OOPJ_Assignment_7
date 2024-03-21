package assignment.solution;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfAvg {

	private static Scanner sc = new Scanner(System.in);

	public static void acceptElements(int arr[]) {
		if (arr.length > 3) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print("Enter the value for arr[" + i + "]  :  ");
				arr[i] = sc.nextInt();
			}
		} else {
			System.out.println("enter the length of the array greater than 3 ");
		}

	}

	// method to get array of three consecutive elements

	public static int[] getAvgArray(int arr[]) {
		int avg = 0;
		int avgArr[] = new int[arr.length - 2];

		if (arr.length > 3) {
			for (int i = 0; i < arr.length - 2; i++) {
				avg = (arr[i] + arr[i + 1] + arr[i + 2]) / 3;
				avgArr[i] = avg;
			}
			return avgArr;
		} else {
			System.out.println("sorry .. we can not calculate , array length is less than 3 ");
		}
		return avgArr;
	}

	// to print the array
	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	// main method

	public static void main(String[] args) {
		System.out.print("Enter the length of the Array = ");

		int[] arr = new int[sc.nextInt()];

		ArrayOfAvg.acceptElements(arr);

		System.out.println("Array of the Avarage of three consecutive Elements =>   ");

		int[] avgArr = getAvgArray(arr);

		ArrayOfAvg.printArray(avgArr);

	}

}
