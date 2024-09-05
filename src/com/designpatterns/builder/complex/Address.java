package com.designpatterns.builder.complex;

public class Address {

	public final String location;

	public Address(Builder builder) {
		this.location = builder.location;
	}

	public static class Builder {
		private String location;

		public Builder location(String location) {
			this.location = location;
			return this;
		}

		public Address build() {
			return new Address(this);
		}
	}

	@Override
	public String toString() {
		return "Address [location=" + location + "]";
	}
}
