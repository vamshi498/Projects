package com.vamshilabs.micorservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	private long id;
	@Column(name = "Currency_From")
	private String from;
	@Column(name = "Currency_To")
	private String to;
	private BigDecimal conversionMultiple;
	private int port;
	public ExchangeValue() {
		
	}
	
	public ExchangeValue(String from, String to, long id, BigDecimal conversionMultiple) {
		super();
		this.from = from;
		this.to = to;
		this.id = id;
		this.conversionMultiple = conversionMultiple;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	
}
