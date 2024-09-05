package com.designpatterns.builder;

public class BuilderDemo {

	public static void main(String[] args) {

		URLBuilder builder = new URLBuilder.Builder()
				.protocol("https://")
				.hostName("www.google.com/")
				.port("8443")
				.path("/abc")
				.build();
		System.out.println(builder);
		
	}

}
