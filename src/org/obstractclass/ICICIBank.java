package org.obstractclass;
//partial abstraction or abstract class
public abstract class ICICIBank {
//non-abstract method
	public void bankAddress(String address) {
		System.out.println("Bank address is "+address);
	}
	//abstract method
	public abstract void loanInterestRate(int rate);
}
