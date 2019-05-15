package com.sis.assignment.rentalcar.service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.sis.assignment.rentalcar.model.Car;

public class Solution {
	String filename;
	List<Car> carList;
	
	public Solution(String filename) { this.filename = filename;}
	
	public void getSolution() {
		Gson gson = new Gson();
        JsonReader reader;
		try{
			reader = new JsonReader(new FileReader(filename));
			Car[] cars = gson.fromJson(reader, Car[].class);
			this.carList = Arrays.asList(cars);
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<Car> res;
		System.out.println(carList);
		System.out.println("\nAll the blue Tesla are: ");
		System.out.println(printBlueTesla());
		System.out.println("\nLowest per day cost, price only: ");
		System.out.println(lowestPerDayCostPriceOnly());
		System.out.println("\nLowest per day cost, after discount: ");
		System.out.println(lowestPerDayCostAfterDiscount());
		System.out.println("\nHighest revenue: ");
		System.out.println(highestRevenue());
	}
	
	public List<Car> printBlueTesla() {
    	//System.out.println("Finding Tesla");
		List<Car> res = new ArrayList<Car>();
    	for(Car car:carList) {
    		if(car.getMake().equals("Tesla")&&car.getMetadata().getColor().equals("Blue")) {
    			System.out.println(car.getMetadata().getNotes());
    			res.add(car);
    		}
    	}
    	return res;
    }
    
	public Car lowestPerDayCostPriceOnly() {
    	//System.out.println("Finding lowest per day cost, price only");
    	Car lowest = null;
    	double minPrice = Integer.MAX_VALUE;
    	for(Car car:carList) {
    		if(car.getPerDayRent().getPrice()<minPrice) {
    			lowest = car;
    			minPrice = car.getPerDayRent().getPrice();
    		}
    	}
    	return lowest;
    }
    
	public Car lowestPerDayCostAfterDiscount() {
    	//System.out.println("Finding lowest per day cost, after discount");
    	Car lowest = null;
    	double minPrice = Integer.MAX_VALUE;
    	for(Car car:carList) {
    		if((car.getPerDayRent().getPrice()*0.01*(100-car.getPerDayRent().getDiscount()))<minPrice) {
    			lowest = car;
    			minPrice = car.getPerDayRent().getPrice()*0.01*(100-car.getPerDayRent().getDiscount());
    		}
    	}
    	return lowest;
    }
    
	public Car highestRevenue() {
    	//System.out.println("Finding lowest per day cost, price only");
    	Car highest = null;
    	double maxRevenue = 0.0;
    	for(Car car:carList) {
    		if(car.getMetrics().getYoyMaintenanceCost()+car.getMetrics().getDepreciation()>maxRevenue) {
    			highest = car;
    			maxRevenue = car.getMetrics().getYoyMaintenanceCost()+car.getMetrics().getDepreciation();
    		}
    	}
    	return highest;
    }
}
