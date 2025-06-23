package SKILLSET_ACADEMY_YOUTUBE_DSA_IN_JAVA;

import java.util.Scanner;

public class APP3_TO_INSERT_AN_ELEMENT_INTO_ARRAY_AT_ANY_INDEX {

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
		
		int arr2[] = new int[arr1.length+1];
		System.out.println("enter the element to add: ");
		int element = sc.nextInt();
		
		System.out.println("enter the index number to add at: ");
		int index = sc.nextInt();
		
		for (int i = 0; i < arr2.length; i++) {
			
			if (i < index) {
				arr2[i] = arr1[i];
			}
			
			else if (i == index) {
				arr2[i] = element;
			}
			
			else {
				arr2[i] = arr1[i - 1];
			}
			
		}
			for(int i=0;i<arr2.length;i++) {
				System.out.println(arr2[i]);
			}
		
		
	}

}
