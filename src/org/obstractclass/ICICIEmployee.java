package org.obstractclass;

public class ICICIEmployee extends ICICIBank {
	public void loanInterestRate(int rate) {
		System.out.println("Customer interest rate is "+rate);
	}
	public static void main(String[] args) {
		ICICIEmployee icicicustomer = new ICICIEmployee();
		icicicustomer.loanInterestRate(7);
		icicicustomer.bankAddress("Chennai");
	}
}
