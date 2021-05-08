package eTicaretProject;

import eTicaretProject.business.concretes.EmailManager;
import eTicaretProject.business.concretes.UserManager;
import eTicaretProject.core.GoogleAuthAdaptor;
import eTicaretProject.dataAccess.concretes.InMemoryUserDao;
import eTicaretProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
			
		
		User user=new User(1,"Orhan","Türkmenoðlu","Orhantr","orhantrkmn748@gmail.com","122245");
		
		UserManager manager=new UserManager(new InMemoryUserDao(),new EmailManager(),new GoogleAuthAdaptor());
		manager.add(user);
		manager.login(user.getUserName(), user.getPassword());
		manager.loginWithGoogle();
	}

}
