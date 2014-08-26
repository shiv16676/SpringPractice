package com.trafigura.tcs;

public class Account {
	
	private int accno;
	private String accHolder;
	
	public Account(String accHolder , int accno){
		this.accHolder= accHolder;
		this.accno = accno;
	}
	
	public Account(int accno){
		this.accno = accno;
	}
	
	public Account(String accHolder){
		this.accHolder = accHolder;
	}
	public int getAccno() {
		return accno;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void withdraw(){
		System.out.println("Welcome:" + getAccHolder() + " Your account number is :" + getAccno());
	}

}
