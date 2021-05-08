package eTicaretProject.business.concretes;

import java.util.Scanner;

import eTicaretProject.business.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("Doðrulama kodu gönderilmiþtir");
		
		Scanner in =new Scanner(System.in);
		System.out.println("Doðrulama kodu giriniz !");
		int code=in.nextInt();
		if (code==1) {
			System.out.println("Doðrulama baþarýlý");
			
		}
		else if (code==2) {
			System.out.println("Doðrulama baþarýlý");
		}
		else if (code==3) {
			System.out.println("Doðrulama baþarýlý");
		}
		else {
			System.out.println("Doðrulama baþarýsýz !");
		}
		
		in.close();
		
	}

	

}
