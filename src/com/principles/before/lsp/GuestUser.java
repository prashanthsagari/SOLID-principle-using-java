package com.principles.before.lsp;

public class GuestUser extends User {

	@Override
	public void login() {
		throw new UnsupportedOperationException("Guest users dont want login feature");
	}
}
