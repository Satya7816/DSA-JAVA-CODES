package SKILLSET_ACADEMY_YOUTUBE_DSA_IN_JAVA;

import java.util.Scanner;

public class APP5_TO_DELETE_AN_ELEMENT_IN_AN_ARRAY_AT_END {

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
		
		
		// code logic begins here
		int arr2[] = new int[arr1.length-1];
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=arr1[i];
		}
		
		// printing the array after deleting the element at ending
		System.out.println("array after deleting the element at ending");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
	}

}
