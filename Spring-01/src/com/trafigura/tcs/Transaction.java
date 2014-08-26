package com.trafigura.tcs;

public class Transaction {
	private Account acc;

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public void transact(){
		System.out.println("Hello..!" + acc.getAccHolder() + "Your Transaction is being Processed....!!");
	}
}
