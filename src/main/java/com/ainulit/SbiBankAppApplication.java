
package com.ainulit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbiBankAppApplication {
       private static final String url="www.ainul.com";

	public static void main(String[] args) {
		SpringApplication.run(SbiBankAppApplication.class, args);
		System.out.println("Welcome App..........");
	}

}
