package com.sujata.bean;

public class Share {

	private int shareId;
	private String shareName;
	private int marketPrice;
	
	public Share() {
		
	}

	
	public Share(int shareId, String shareName, int marketPrice) {
		super();
		this.shareId = shareId;
		this.shareName = shareName;
		this.marketPrice = marketPrice;
	}


	public int getShareId() {
		return shareId;
	}

	public void setShareId(int shareId) {
		this.shareId = shareId;
	}

	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public int getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(int marketPrice) {
		this.marketPrice = marketPrice;
	}
	
	
}
