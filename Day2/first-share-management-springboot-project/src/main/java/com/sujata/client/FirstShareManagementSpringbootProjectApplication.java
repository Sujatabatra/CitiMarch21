package com.sujata.client;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sujata.presentation.SharePresentation;

/*
 * @SpringBootAnnotation : @Configuration + @ComponentScan
 */
@SpringBootApplication(scanBasePackages = "com.sujata")
public class FirstShareManagementSpringbootProjectApplication implements CommandLineRunner{

	@Autowired
	private SharePresentation sharePresentation;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstShareManagementSpringbootProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			sharePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			sharePresentation.performMenu(choice);
		}
		
	}

}
