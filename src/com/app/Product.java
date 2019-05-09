package com.app;

public class Product {
	private int prodId;
	private String prodCode;
	private double rodCost;
	public Product() {
		super();
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public double getRodCost() {
		return rodCost;
	}
	public void setRodCost(double rodCost) {
		this.rodCost = rodCost;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", rodCost=" + rodCost + "]";
	}
	

}
