package assignment.solution;

import java.util.*;

public class EqualArrays {

	public static boolean isEqual(int arr1[], int arr2[]) {

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void acceptRecord(int arr[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("enter the value of arr[" + i + "] : ");
			arr[i] = sc.nextInt();

		}
		sc.close();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array : ");
		int length = sc.nextInt();
		int arr1[] = new int[length];
		int arr2[] = new int[length];

		System.out.println("Enter the elements for array 1 => ");
		acceptRecord(arr1);
		System.out.println("Enter the elements for array 2 => ");
		acceptRecord(arr2);
		boolean isEqual = isEqual(arr1, arr2);

		if (isEqual) {
			System.out.println("Both the Arrays are Equal :) ");
		} else {
			System.out.println("Both the Arrays are not Equal :( ");
		}
		
		sc.close();

	}

}
