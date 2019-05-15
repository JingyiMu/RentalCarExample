package com.sis.assignment.rentalcar.model;

import com.google.gson.annotations.SerializedName;

public class Metadata{
	@SerializedName("Color")
	private String color;
	
	@SerializedName("Notes")
	private String notes;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "Metadata [color=" + color + ", notes=" + notes + "]";
	}
}

