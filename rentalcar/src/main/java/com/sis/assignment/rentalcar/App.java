package com.sis.assignment.rentalcar;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.sis.assignment.rentalcar.model.Car;
import com.sis.assignment.rentalcar.service.Solution;

/**
 * Main application to: 
 * Print all the blue Teslas received in the web service response. Also print the notes
 * 
 * Return all cars which have the lowest per day rental cost for both cases:
 *	a. Price only
 *
 *	b. Price after discounts
 *
 * Find the highest revenue generating car. 
 * year over year maintenance cost + depreciation 
 * is the total expense per car for the full year for the rental car company.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//System.out.println( "Hello World!" );
        Solution solution = new Solution(System.getProperty("user.dir")+"/inputs/cars.json");
		solution.getSolution();
		
    }
    
}
