package com.sis.assignment.rentalcar.model;

import com.google.gson.annotations.SerializedName;
import com.sis.assignment.rentalcar.model.Metrics.RentalCount;

public class Metrics{
	
	class RentalCount{
		@SerializedName("lastweek")
		private int lastWeek;
		
		@SerializedName("yeartodate")
		private int yearToDate;
		
		public int getLastWeek() {
			return lastWeek;
		}
		public void setLastWeek(int lastWeek) {
			this.lastWeek = lastWeek;
		}
		public int getYearToDate() {
			return yearToDate;
		}
		public void setYearToDate(int yearToDate) {
			this.yearToDate = yearToDate;
		}
		@Override
		public String toString() {
			return "RentalCount [lastWeek=" + lastWeek + ", yearToDate=" + yearToDate + "]";
		}
	}
	
	@SerializedName("yoymaintenancecost")
	private double yoyMaintenanceCost;
	
	private double depreciation;
	
	

	@SerializedName("rentalcount")
	private RentalCount rentalCount;

	public double getYoyMaintenanceCost() {
		return yoyMaintenanceCost;
	}

	public void setYoyMaintenanceCost(double yoyMaintenanceCost) {
		this.yoyMaintenanceCost = yoyMaintenanceCost;
	}

	public double getDepreciation() {
		return depreciation;
	}

	public void setDepreciation(double depreciation) {
		this.depreciation = depreciation;
	}

	public RentalCount getRentalCount() {
		return rentalCount;
	}

	public void setRentalCount(RentalCount rentalCount) {
		this.rentalCount = rentalCount;
	}
	@Override
	public String toString() {
		return "Metrics [yoyMaintenanceCost=" + yoyMaintenanceCost + ", depreciation=" + depreciation + ", rentalCount="
				+ rentalCount + "]";
	}
}
