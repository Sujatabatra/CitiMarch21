package com.sujata.presentation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.bean.CustomerShareDetail;
import com.sujata.bean.Share;
import com.sujata.service.CustomerShareDetailService;
import com.sujata.service.CustomerShareDetailServiceImpl;
import com.sujata.service.ShareService;
import com.sujata.service.ShareServiceImpl;

/*
 * if you want to display any object with System.out.println(), the override ToString() from object class in the class whoes object values you want to print
 */
@Component
public class SharePresentationImpl implements SharePresentation {

//	private ShareService shareService = new ShareServiceImpl();
//	private CustomerShareDetailService customerShareDetailService=new CustomerShareDetailServiceImpl();
	@Autowired
	private ShareService shareService;
	@Autowired
	private CustomerShareDetailService customerShareDetailService;
	
	
	public void setShareService(ShareService shareService) {
		this.shareService = shareService;
	}

	public void setCustomerShareDetailService(CustomerShareDetailService customerShareDetailService) {
		this.customerShareDetailService = customerShareDetailService;
	}

	@Override
	public void showMenu() {
		System.out.println("1. List All Shares");
		System.out.println("2. Adding New Share");
		System.out.println("3. Search Share By ID");
		System.out.println("4. Show Customer Share Details for All Customers");
		System.out.println("5. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1:
			ArrayList<Share> shares=null;
			try {
				shares = shareService.getAllShares();
			} catch (ClassNotFoundException | SQLException e) {
			
				e.printStackTrace();
			}
			for (Share share : shares) {
				System.out.println(share);
			}
			break;
		case 2:
			Share share=new Share();
			
			System.out.println("Enter Instrument Id : ");
			share.setInstrumentId(scanner.nextInt());
			System.out.println("Enter Instument Name : ");
			share.setInstrumentName(scanner.next());
			System.out.println("Enter Market Rate : ");
			share.setMarketRate(scanner.nextInt());
			
			try {
				if(shareService.addShare(share))
					System.out.println("Share Insertion Successful!");
				else
					System.out.println("Share Insertion Failed!");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("Enter share ID whoes Record you want to search for : ");
			int sId=scanner.nextInt();
			Share sh=null;
			try {
				sh = shareService.searchShareRecordById(sId);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(sh!=null) {
				System.out.println(sh);
			}
			else {
				System.out.println("Share with id "+sId+" does not exist");
			}
			break;
		case 4:
			ArrayList<CustomerShareDetail> customerShareDetails=null;
			try {
				customerShareDetails = customerShareDetailService.getAllCustomerShareDetails();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(CustomerShareDetail customerShareDetail:customerShareDetails) {
				System.out.println(customerShareDetail);
			}
			break;
		case 5:
			System.out.println("Thanks for Using our system, Have a Nice Day!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice!");

		}

	}

}
