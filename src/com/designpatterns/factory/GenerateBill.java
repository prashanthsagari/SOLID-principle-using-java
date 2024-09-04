package com.designpatterns.factory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String[] args) throws Exception {
		
		GetPlanFactory planFactory = new GetPlanFactory(); // Factory object
		System.out.println("Enter the name of plan ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String planName = br.readLine();
		System.out.println("Enter number of units");
		int units = Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getPlan(planName);
		
		p.getRate();
		p.calculateBill(units);
	}

}
