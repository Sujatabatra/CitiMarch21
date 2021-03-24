package com.sujata.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.config.ShareManagementConfig;
import com.sujata.presentation.SharePresentation;
import com.sujata.presentation.SharePresentationImpl;

public class ShareManagementMain {

	public static void main(String[] args) {
//		SharePresentation sharePresentation=new SharePresentationImpl();
		
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("jdbc.xml");
		ApplicationContext springContainer=new AnnotationConfigApplicationContext(ShareManagementConfig.class);
		
		SharePresentation sharePresentation=(SharePresentation)springContainer.getBean("sharePresentationImpl");
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
			sharePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			sharePresentation.performMenu(choice);
			
		}

	}

}
