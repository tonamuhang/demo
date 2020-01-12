package com.springbasics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		BinarySearchImpl search = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = search.binarySearch(new int[] {13, 1, 5}, 3);
		
		System.out.println(result);
		// SpringApplication.run(DemoApplication.class, args);
	}

}
