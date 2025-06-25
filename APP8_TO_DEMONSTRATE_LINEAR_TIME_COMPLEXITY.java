package SKILLSET_ACADEMY_YOUTUBE_DSA_IN_JAVA;

import java.util.Scanner;

public class APP8_TO_DEMONSTRATE_LINEAR_TIME_COMPLEXITY {

	public static void main(String[] args) {
		
		// this is a program to demonstrate Linear time complexity 
		/*
		 * This means that as the input size increases
		 * the time required also increases 
		 * The time complexity will be O(n)
		 * */
		
		System.out.println("enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("i am learning java for the "+i+"th time");
		}
	}

}
