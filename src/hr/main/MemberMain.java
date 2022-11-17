package hr.main;

import java.util.* ;


import hr.dao.*;
import hr.vo.*;



public class MemberMain {
	private int input;
	private LoginCheck lchk = new LoginCheck();
	private Scanner scan = new Scanner(System.in);
	private String id, pw;
	

	public void menu() {
		
	}
	
	public void login() {
		lchk.loginChk(id, pw);
	}
	
	public void logout() {
		
	}

	public void memberMenu() {
		
	}

	
	public void adminMenu() {
		
	}

	public static void main(String[] args) {
		new MemberMain().menu();

	}

}
