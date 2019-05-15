package com.sis.assignment.rentalcar.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.sis.assignment.rentalcar.model.Car;
import com.sis.assignment.rentalcar.service.Solution;

public class BlueTeslaTest{
	@Test
    public void testBlueTesla() {
		Solution solution = new Solution(System.getProperty("user.dir")+"/inputs/car_blueTesla.json");
		solution.getSolution();
		List<Car> res = solution.printBlueTesla();
		for(Car car:res) {
			assertEquals("Tesla", car.getMake());
			assertEquals("Blue", car.getMetadata().getColor());
		}
    }
}
