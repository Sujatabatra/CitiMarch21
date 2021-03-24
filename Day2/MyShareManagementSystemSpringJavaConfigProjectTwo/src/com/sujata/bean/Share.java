package com.sujata.bean;

public class Share {

	private int instrumentId;
	private String instrumentName;
	private int marketRate;
	
	public Share() {
		
	}
	public Share(int instrumentId, String instrumentName, int marketRate) {
		super();
		this.instrumentId = instrumentId;
		this.instrumentName = instrumentName;
		this.marketRate = marketRate;
	}
	public int getInstrumentId() {
		return instrumentId;
	}
	public void setInstrumentId(int instrumentId) {
		this.instrumentId = instrumentId;
	}
	public String getInstrumentName() {
		return instrumentName;
	}
	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}
	public int getMarketRate() {
		return marketRate;
	}
	public void setMarketRate(int marketRate) {
		this.marketRate = marketRate;
	}
	@Override
	public String toString() {
		return "Share [instrumentId=" + instrumentId + ", instrumentName=" + instrumentName + ", marketRate="
				+ marketRate + "]";
	}
	
	
}
