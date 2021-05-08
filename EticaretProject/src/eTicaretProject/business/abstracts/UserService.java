package eTicaretProject.business.abstracts;

import eTicaretProject.entities.concretes.User;

public interface UserService {
	void add(User user);
	void login(String userName,String password);
	void loginWithGoogle();
	
}
