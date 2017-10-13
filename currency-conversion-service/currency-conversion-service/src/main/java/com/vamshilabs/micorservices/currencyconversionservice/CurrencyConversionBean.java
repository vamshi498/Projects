package com.vamshilabs.micorservices.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	private Long id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal conversionMultiple;
	private BigDecimal totalcalculatedAmount;
	private int port;
	public CurrencyConversionBean() {
		
	}
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple,
			BigDecimal totalcalculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.totalcalculatedAmount = totalcalculatedAmount;
		this.port = port;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public BigDecimal getTotalcalculatedAmount() {
		return totalcalculatedAmount;
	}
	public void setTotalcalculatedAmount(BigDecimal totalcalculatedAmount) {
		this.totalcalculatedAmount = totalcalculatedAmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
}
