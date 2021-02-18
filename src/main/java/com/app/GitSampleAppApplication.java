package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitSampleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitSampleAppApplication.class, args);
		System.out.println("Checking pull request");
	}

}
