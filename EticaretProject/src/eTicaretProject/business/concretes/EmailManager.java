package eTicaretProject.business.concretes;

import java.util.Scanner;

import eTicaretProject.business.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("Do�rulama kodu g�nderilmi�tir");
		
		Scanner in =new Scanner(System.in);
		System.out.println("Do�rulama kodu giriniz !");
		int code=in.nextInt();
		if (code==1) {
			System.out.println("Do�rulama ba�ar�l�");
			
		}
		else if (code==2) {
			System.out.println("Do�rulama ba�ar�l�");
		}
		else if (code==3) {
			System.out.println("Do�rulama ba�ar�l�");
		}
		else {
			System.out.println("Do�rulama ba�ar�s�z !");
		}
		
		in.close();
		
	}

	

}
