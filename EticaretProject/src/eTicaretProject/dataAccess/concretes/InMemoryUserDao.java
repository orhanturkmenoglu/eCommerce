package eTicaretProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretProject.dataAccess.abstracts.UserDao;
import eTicaretProject.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	private List<User> users;

	public InMemoryUserDao() {
		users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		users.add(user);
		System.out.println(user.toString().concat(" eklendi"));
	}

	@Override
	public boolean checkEmail(String email) {
		boolean emailExists = false;

		for (User user : users) {
			if (user.getEmail().equalsIgnoreCase(email)) {
				emailExists = true;
			}
		}

		return emailExists;
	}

	@Override
	public void login(String userName, String password) {
		boolean result = false;

		for (User user : users) {
			if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
				result = true;
			}
		}
		
		if (result) {
			System.out.println("Giriþ baþarýlý");
		} else {
			System.out.println("Giriþ baþarýsýz");
		}

	}
}
