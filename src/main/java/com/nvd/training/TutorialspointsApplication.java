package com.nvd.training;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*public class TutorialspointsApplication implements ApplicationRunner {*/
public class TutorialspointsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TutorialspointsApplication.class, args);
	}

	/*
	 * Command Line Runner is an interface. It is used to execute the code after the
	 * Spring Boot application started.
	 */
	@Override
	public void run(String... args) throws Exception {
		System.out.println("This is a calling from Application Runner");
		
	}

	/*
	 * Application Runner is an interface used to execute the code after the Spring
	 * Boot application started
	 */
//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		System.out.println("This is a calling from Application Runner");
//		
//	}

}
