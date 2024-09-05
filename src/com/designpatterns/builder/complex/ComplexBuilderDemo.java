package com.designpatterns.builder.complex;

public class ComplexBuilderDemo {

	public static void main(String[] args) {

	    System.out.println(new Person.Builder()
	              .name("Prashanth Sagari")
	              .age(32)
	              .address(new Address.Builder().location("Dharmavaram").build())
	              .build());
	}

}
