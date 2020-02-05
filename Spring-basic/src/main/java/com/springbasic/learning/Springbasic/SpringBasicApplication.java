package com.springbasic.learning.Springbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicApplication {

	public static void main(String[] args) {

		//Method 1 Using Constructor
//		BinarySearch binarySearch = new BinarySearch(new QuickSort());
//		int result = BinarySearch.binarySearch(new int[] {12,4,6}, 3);
//		System.out.println(result);

		//Method 2 Using Spring Boot

		ApplicationContext applicationContext =
				SpringApplication.run(SpringBasicApplication.class, args);
		BinarySearch b_Search = applicationContext.getBean(BinarySearch.class);
		int result = b_Search.binary_Search(new int[] {12,4,6}, 3);
		System.out.println(result);

	}

}
