package SKILLSET_ACADEMY_YOUTUBE_DSA_IN_JAVA;

public class APP7_TO_DEMONSTRATE_CONSTANT_TIME_COMPLEXITY {

	public static void main(String[] args) {

		// this is a program to demonstrate Constant time complexity 
		/*
		 * This means that as the input size increases
		 * the time required does not increase 
		 * The time complexity will be O(1)
		 * 
		 * here the compiler follows the formula
		 * base_address + (index * size of the element) = required element address
		 */
		
		int arr[] = {9,6,5,4,7,0,2,3};
		System.out.println(arr[3]);
	}

}
