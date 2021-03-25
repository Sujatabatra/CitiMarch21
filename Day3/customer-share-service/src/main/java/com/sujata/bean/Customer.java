package com.sujata.bean;

public class Customer {

	private int detailId;
	private String customerId;
	private int shareId;
	private String shareType;
	private int quantity;
	
	public Customer() {
		
	}
	public Customer(int detailId, String customerId, int shareId, String shareType, int quantity) {
		super();
		this.detailId = detailId;
		this.customerId = customerId;
		this.shareId = shareId;
		this.shareType = shareType;
		this.quantity = quantity;
	}
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public int getShareId() {
		return shareId;
	}
	public void setShareId(int shareId) {
		this.shareId = shareId;
	}
	public String getShareType() {
		return shareType;
	}
	public void setShareType(String shareType) {
		this.shareType = shareType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
