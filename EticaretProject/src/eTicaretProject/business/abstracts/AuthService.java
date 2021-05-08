package eTicaretProject.business.abstracts;

import eTicaretProject.entities.concretes.User;

public interface AuthService {
	void login(User user);
}
