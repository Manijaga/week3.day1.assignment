package org.college;

public class AxisBank extends BankInfo {
	//Overriding Medhod from Bankinfo 
	public void deposit() {
		System.out.println("Your amount has been deposited in the bank successfully");
	}
	
	public static void main(String[] args) {
		
		AxisBank myBank = new AxisBank();		
		myBank.deposit();
		
	}
}
