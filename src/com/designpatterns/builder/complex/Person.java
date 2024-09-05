package com.designpatterns.builder.complex;

public class Person {

	private final String name;
	private final int age;
	private final Address address;

	public Person(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.address = builder.address;
	}

	public static class Builder {
		private String name;
		private int age;
		private Address address;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder address(Address address) {
			this.address = address;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
