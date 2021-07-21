
package com.ainulit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbiBankAppApplication {
          Map<String,String> hm=new HashMap<>();
	public static void main(String[] args) {
		SpringApplication.run(SbiBankAppApplication.class, args);
		System.out.println("Welcome App..........");
	}


       public void loadDataToCache()
{
}
}
