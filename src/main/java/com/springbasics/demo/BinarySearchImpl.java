package com.springbasics.demo;


public class BinarySearchImpl {
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int[] numbers, int number) {

		
		// Sort an array
		
		/* Tight coupling
		 * Bubble sort
		 * Quick sort
		*/
		
		// Loose coupling
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		// Search the array
		
		
		// Return
		return 3;
	}
	
	
}
