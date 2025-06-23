package SKILLSET_ACADEMY_YOUTUBE_DSA_IN_JAVA;

import java.util.Scanner;

public class APP1_TO_INSERT_AN_ELEMENT_INTO_ARRAY_AT_BEGINNING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr1[] = new int[size];
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println("enter the "+i+"th element: ");
			arr1[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("enter the element to add at beginning: ");
		int element = sc.nextInt();
		
		int arr2[] = new int[arr1.length+1];
		arr2[0] = element;
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i+1] = arr1[i];
		}
		
		System.out.println("the new array is : ");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}

}
