package com.sujata.bean;

public class CustomerShareDetail {

	private int detailId;
	private String shareType;
	private int quantity;
	private String customerName;
	private String instrumentName;
	
	public CustomerShareDetail() {
		
	}

	public CustomerShareDetail(int detailId, String shareType, int quantity, String customerName,
			String instrumentName) {
		super();
		this.detailId = detailId;
		this.shareType = shareType;
		this.quantity = quantity;
		this.customerName = customerName;
		this.instrumentName = instrumentName;
	}

	public int getDetailId() {
		return detailId;
	}

	public void setDetailId(int detailId) {
		this.detailId = detailId;
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

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	@Override
	public String toString() {
		return "CustomerShareDetail [detailId=" + detailId + ", shareType=" + shareType + ", quantity=" + quantity
				+ ", customerName=" + customerName + ", instrumentName=" + instrumentName + "]";
	}
	
	
}
