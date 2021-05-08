package eTicaretProject.dataAccess.abstracts;



import eTicaretProject.entities.concretes.User;

public interface UserDao {
	void add(User user);
	boolean checkEmail(String email);
	void login(String userName, String password);
}
