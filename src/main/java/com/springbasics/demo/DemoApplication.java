package com.springbasics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

// The annotation scans the package for beans
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		// QuickSortAlgorithm is a bean
		// The dependency of the binarysearchimpl is the sort algorithm
		
		/* Spring does this for us
		* BinarySearchImpl search = new BinarySearchImpl(new QuickSortAlgorithm());
		*/
		
		// Application Context
		ApplicationContext applicationConext = 
				SpringApplication.run(DemoApplication.class, args);
		// Get the bean
		BinarySearchImpl search = applicationConext.getBean(BinarySearchImpl.class);
		int result = search.binarySearch(new int[] {13, 1, 5}, 3);
		
		System.out.println(result);
		
	}

}
