package com.principles.after.lsp;

public class RegisteredUser implements User {

	@Override
	public void login() {
		System.out.println("Guest user login logic");
	}

}
