package com.principles.after.lsp;

public class GuestUser implements User {

	@Override
	public void login() {
		System.out.println("Allow without login logic for guest user");
	}

}
