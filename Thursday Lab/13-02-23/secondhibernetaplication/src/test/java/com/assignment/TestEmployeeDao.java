package com.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment.model.Employee;

public class TestEmployeeDao {

	Employee emp =new Employee("Mansi", "Chavan", "mansichavan2024@gmail.com", 120000.55);
	@Test //positive test case
	public void testgetFirstName() {
		assertEquals("Mansi",emp.getFirstName());
	}
	
	@Test //negative test case
	public void testgetLastName() {
		assertEquals("Mansi",emp.getLastName());
	}
}
