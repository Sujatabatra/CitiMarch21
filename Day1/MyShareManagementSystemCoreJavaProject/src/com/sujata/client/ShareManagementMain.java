package com.sujata.client;

import java.util.Scanner;

import com.sujata.presentation.SharePresentation;
import com.sujata.presentation.SharePresentationImpl;

/*
 * 1. List All Records
 * 2. Add New Share
 * 3.Search Share By ID
 * 4. Delete Share By ID ( Assignment)
 * 5. Update Share Market Price with ID (Assignment)
 * 6. Exit
 */

public class ShareManagementMain {

	public static void main(String[] args) {
		SharePresentation sharePresentation=new SharePresentationImpl();
		//To Take inout from the user
		Scanner scanner=new Scanner(System.in);
		while(true) {
			sharePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			sharePresentation.performMenu(choice);
			
		}

	}

}
