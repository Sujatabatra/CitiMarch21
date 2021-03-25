package com.sujata.bean;

public class CustomerShareDetails {

	private String customerId;
	private String shareName;
	private int quantity;
	private int unitPrice;
	private int totalValuation;
	private String shareType;
	
	public CustomerShareDetails() {
	
	}

	public CustomerShareDetails(String customerId, String shareName, int quantity, int unitPrice, int totalValuation,
			String shareType) {
		super();
		this.customerId = customerId;
		this.shareName = shareName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalValuation = totalValuation;
		this.shareType = shareType;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getTotalValuation() {
		return totalValuation;
	}

	public void setTotalValuation(int totalValuation) {
		this.totalValuation = totalValuation;
	}

	public String getShareType() {
		return shareType;
	}

	public void setShareType(String shareType) {
		this.shareType = shareType;
	}
	
	
}
