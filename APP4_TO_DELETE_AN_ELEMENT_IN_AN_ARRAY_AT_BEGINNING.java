package SKILLSET_ACADEMY_YOUTUBE_DSA_IN_JAVA;

import java.util.Scanner;

public class APP4_TO_DELETE_AN_ELEMENT_IN_AN_ARRAY_AT_BEGINNING {

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
		if(arr1.length==0) {
			System.out.println("array has no elements in it...");
			return;
		}
		
		for(int i=1;i<arr1.length;i++) {
			arr1[i-1]=arr1[i];
		}
		
		size--;
		
		System.out.println("array after deleting an element at beginning ");
		for(int i=0;i<size;i++) {
			System.out.println(arr1[i]);
		}
	}

}
