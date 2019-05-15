package com.sis.assignment.rentalcar.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.sis.assignment.rentalcar.model.Car;
import com.sis.assignment.rentalcar.service.Solution;

public class LowestCostTest{
	@Test
    public void testLowestCost() {
		Solution solution = new Solution(System.getProperty("user.dir")+"/inputs/car_lowestCost.json");
		solution.getSolution();
		Car lowestPriceOnly = solution.lowestPerDayCostPriceOnly();
		Car lowestAfterDiscount = solution.lowestPerDayCostAfterDiscount();
		assertEquals("XGJBKN2U5R7LTM2WTKZ", lowestPriceOnly.getVin());
		assertEquals("FI9NGBYWAEYZ6HA599K", lowestAfterDiscount.getVin());
    }
}
