package com.suntossh.springboot.client.forex.model;

import java.math.BigDecimal;

public class Forex {

	private String fromCcy;
	private String toCcy;
	private BigDecimal rate;
	private BigDecimal value;
	private BigDecimal totalValue;
	private String port;

	public Forex(String fromCcy, String toCcy, BigDecimal rate, BigDecimal value, BigDecimal totalValue, String port) {
		super();
		this.fromCcy = fromCcy;
		this.toCcy = toCcy;
		this.rate = rate;
		this.value = value;
		this.totalValue = totalValue;
		this.port = port;
	}

	public String getFromCcy() {
		return fromCcy;
	}

	public void setFromCcy(String fromCcy) {
		this.fromCcy = fromCcy;
	}

	public String getToCcy() {
		return toCcy;
	}

	public void setToCcy(String toCcy) {
		this.toCcy = toCcy;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "Forex [fromCcy=" + fromCcy + ", toCcy=" + toCcy + ", rate=" + rate + ", value=" + value
				+ ", totalValue=" + totalValue + ", port=" + port + "]";
	}

}
