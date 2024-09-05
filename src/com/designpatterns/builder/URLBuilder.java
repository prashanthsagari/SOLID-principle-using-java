package com.designpatterns.builder;

public class URLBuilder {

	public final String protocol;
	public final String hostName;
	public final String port;
	public final String path;

	private URLBuilder(Builder builder) {
		this.protocol = builder.protocol;
		this.hostName = builder.hostName;
		this.port = builder.port;
		this.path = builder.path;
	}

	public static class Builder {
		private String protocol;
		private String hostName;
		private String port;
		private String path;

		public Builder protocol(String protocol) {
			this.protocol = protocol;
			return this;
		}

		public Builder hostName(String hostName) {
			this.hostName = hostName;
			return this;
		}

		public Builder port(String port) {
			this.port = port;
			return this;
		}

		public Builder path(String path) {
			this.path = path;
			return this;
		}

		public URLBuilder build() {
			return new URLBuilder(this);
		}
	}

	@Override
	public String toString() {
		return protocol + hostName + port;
	}
}
