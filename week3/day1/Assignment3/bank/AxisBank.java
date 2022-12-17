package org.bank;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {
		//create object for class Axisbank
		AxisBank mybank = new AxisBank();
		
		//Method from super class BankInfo
		mybank.saving();
		mybank.fixed();
		
		//Overrided method from class AxisBank
		mybank.deposit();

	}

	@Override
	public void deposit() {
		// override the deposit method in Axis Bank
		super.deposit();
		System.out.println("Deposit in Axis Bank");
	}
	
	

}
