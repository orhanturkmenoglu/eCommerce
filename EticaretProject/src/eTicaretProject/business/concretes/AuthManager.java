package eTicaretProject.business.concretes;

import eTicaretProject.business.abstracts.AuthService;
import eTicaretProject.business.utilites.Validation;
import eTicaretProject.entities.concretes.User;

public class AuthManager implements AuthService {
	
	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		if (!(Validation.isValidEmail(user.getEmail()) && user.getEmail().length()>0)) {
			System.out.println("email format veya email karakter uzunluðu boþ býrakýlmamalýdýr !");
			return;
		}
		if (!user.getPassword().isEmpty() && user.getPassword().length()>=6) {
			System.out.println("parola boþ býrakýlamaz ve  en az 6 karakter olmalýdýr !");
			return;
		}
	}

}
