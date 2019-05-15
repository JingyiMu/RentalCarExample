package com.sis.assignment.rentalcar.model;

import com.google.gson.annotations.SerializedName;

public class PerDayRent{
	@SerializedName("Price")
	private int price;
	
	@SerializedName("Discount")
	private int discount;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "PerDayRent [price=" + price + ", discount=" + discount + "]";
	}
}
