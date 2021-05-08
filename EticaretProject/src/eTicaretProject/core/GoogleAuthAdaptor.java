package eTicaretProject.core;

import eTicaretProject.googleAuth.GoogleAuthManager;

public class GoogleAuthAdaptor implements GoogleAuthService {
	GoogleAuthManager manager;

	public GoogleAuthAdaptor() {
		manager = new GoogleAuthManager();
	}

	@Override
	public void login() {
		manager.login();
	}

}
