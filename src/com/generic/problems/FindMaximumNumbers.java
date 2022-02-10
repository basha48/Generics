package com.generic.problems;

import java.util.Arrays;

public class FindMaximumNumbers <T extends Comparable<T>>{
	// using method to find max value
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	    T max = x; 
	    if (y.compareTo(max) > 0)
	      max = y; 

	    if (z.compareTo(max) > 0)
	      max = z; 

	    return max; 
	  } 
	
	
	public void testMax(T x, T y, T z) {
		 T max = x; 
		    if (y.compareTo(max) > 0)
		      max = y; 

		    if (z.compareTo(max) > 0)
		      max = z; 
		    System.out.println("Maximum value is :" +max);
	}

	//sort a numbers
	public void sort( int [] sortElements) {
		Arrays.sort(sortElements);
		System.out.println(Arrays.toString(sortElements));
	}

	// using constructor find max value
	FindMaximumNumbers(T x, T y, T z){
		testMax(x, y, z);
	} 
	
	  public static void main(String args[]) {
	    System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
	    System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6,
	        8.8, 7.7));
	    System.out.printf("Maximum of %s, %s and %s is %s\n", "Apple", "Peach", "Banana", maximum(
	        "Apple", "Peach", "Banana"));
	    FindMaximumNumbers findMaximumNumbers = new FindMaximumNumbers(10,20,30);
	    findMaximumNumbers.sort(new int [] {15,2,3});
	  }
	}
