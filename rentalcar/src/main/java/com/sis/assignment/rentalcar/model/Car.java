package com.sis.assignment.rentalcar.model;


import com.google.gson.annotations.SerializedName;
/**
 * Model object to map each Car in JSON array of the response
 *
 */

public class Car {
	private String make;
	private String model;
	private String vin;
	
	private Metadata metadata;
	
	@SerializedName("perdayrent")
	private PerDayRent perDayRent;
	
	private Metrics metrics;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public Metadata getMetadata() {
		return metadata;
	}
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
	public PerDayRent getPerDayRent() {
		return perDayRent;
	}
	public void setPerDayRent(PerDayRent perDayRent) {
		this.perDayRent = perDayRent;
	}
	public Metrics getMetrics() {
		return metrics;
	}
	public void setMetrics(Metrics metrics) {
		this.metrics = metrics;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", vin=" + vin + ", metadata=" + metadata + ", perDayRent="
				+ perDayRent + ", metrics=" + metrics + "]";
	}
	
	
}
