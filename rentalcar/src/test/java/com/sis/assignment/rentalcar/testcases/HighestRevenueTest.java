package com.sis.assignment.rentalcar.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sis.assignment.rentalcar.model.Car;
import com.sis.assignment.rentalcar.service.Solution;

public class HighestRevenueTest {
	
	@Test
    public void testHighestRevenue() {
		Solution solution = new Solution(System.getProperty("user.dir")+"/inputs/car_highestRevenue.json");
		solution.getSolution();
		Car highestRevenue = solution.highestRevenue();
		assertEquals("IZG9GQLYJ6S984EVMKW", highestRevenue.getVin());
    }

}
