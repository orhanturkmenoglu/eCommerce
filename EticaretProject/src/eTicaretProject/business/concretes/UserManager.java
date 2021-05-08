package eTicaretProject.business.concretes;

import eTicaretProject.business.abstracts.EmailService;
import eTicaretProject.business.abstracts.UserService;
import eTicaretProject.business.utilites.Validation;
import eTicaretProject.core.GoogleAuthService;
import eTicaretProject.dataAccess.abstracts.UserDao;
import eTicaretProject.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private EmailService emailService;
	private GoogleAuthService authService;

	public UserManager(UserDao userDao, EmailService emailService, GoogleAuthService authService) {
		this.userDao = userDao;
		this.emailService = emailService;
		this.authService = authService;
	}

	@Override
	public void add(User user) {

		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("ad ve soyad en az 2 karakter olmalýdýr !");
			return;
		}

		if (user.getPassword().length() < 6) {
			System.out.println("parola en az 6 karakter olmalýdýr !");
			return;
		}

		if (!Validation.isValidEmail(user.getEmail())) {
			System.out.println("email format yanlýþ tekrar deneyin !");
			return;
		}

		if (userDao.checkEmail(user.getEmail())) {
			System.out.println("Email daha önce kayýtlýdýr.");
			return;
		}

		userDao.add(user);

		emailService.send();
		

	}

	@Override
	public void login(String userName, String password) {
		
		userDao.login(userName, password);
		
	}

	@Override
	public void loginWithGoogle() {
		
		authService.login();
		
	}

}
