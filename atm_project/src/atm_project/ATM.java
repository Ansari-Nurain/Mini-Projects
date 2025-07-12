package atm_project;

import java.util.Scanner;

public class ATM {
	
	int pin = 2222, temp=0;
	int balance;
	
	public void pinNumber() {
		
		System.out.println("Please enter your valid pin ");
		Scanner sc = new Scanner(System.in);
		temp = sc.nextInt();
		
		if(temp==pin) {

			menu();
			
		}else {
			System.out.println("Please enter valid pin");
			
		}
		
	}

	 void menu() {

		System.out.println("Choose your option");
		System.out.println(" ");
		System.out.println("1 for Check Balance");
		System.out.println("2 for Withdrawal Money");
		System.out.println("3 for Deposite Money");
		System.out.println("4 for Exit");
		
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		
		if(inp == 1) {
			
			checkBalance();	
			
		}else if(inp==2) {
			
			withdrawal();
			
		}else if(inp==3) {
			
			deposite();
			
		}else if(inp==4) {

			return;
			
		}else {
			System.out.println("Please enter valid option");
		}
	}
	 
	 
	 void checkBalance() {

		System.out.println("Total balance is = "+ balance);
		menu();
	}

	 void deposite() {

		System.out.println("Please enter your amount ");
		Scanner sc = new Scanner(System.in);
		int dept = sc.nextInt();
		balance = balance+dept;
		System.out.println("Deposite successful");
		menu();
	}

	 void withdrawal() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your withdrawal amaunt");
		int amt = sc.nextInt();
		if(amt>balance) {
			System.out.println("Insuficient balance");
		}else {
			balance = balance-amt;
			System.out.println(balance);
		}
		menu();
	}
	 



	

	
	public static void main(String[] args) {
		
		ATM a = new ATM();
		a.pinNumber();
		

	}

}
