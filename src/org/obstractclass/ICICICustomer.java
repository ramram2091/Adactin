package org.obstractclass;

public class ICICICustomer extends ICICIBank {
	public void loanInterestRate(int rate) {
		System.out.println("Customer interest rate is "+rate);
	}
	public static void main(String[] args) {
		ICICICustomer icicicustomer = new ICICICustomer();
		icicicustomer.loanInterestRate(11);
		icicicustomer.bankAddress("Chennai");
	}
}
