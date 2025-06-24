package SKILLSET_ACADEMY_YOUTUBE_DSA_IN_JAVA;

import java.util.Scanner;

public class APP6_TO_DELETE_AN_ELEMENT_IN_AN_ARRAY_AT_ANY_INDEX {

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
		
		
		// the real code logic begins here
		int arr2[] = new int[arr1.length-1];
		
		System.out.println("enter an index value to delete an element: ");
		int index = sc.nextInt();
		if(index<0 || index >arr1.length) {
			System.out.println("invlaid index number");
			return;
		}
		
		for(int i=0;i<index;i++) {
			arr2[i]=arr1[i];
		}
		
		for(int i=index;i<arr2.length;i++) {
			arr2[i]=arr1[i+1];
		}
		
		// array after deleting the element at a specific index
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		
	}

}
