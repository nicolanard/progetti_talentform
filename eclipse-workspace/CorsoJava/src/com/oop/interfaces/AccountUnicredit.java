package com.oop.interfaces;

public class AccountUnicredit implements IAccountUnicredit, IMyAccountWeBank {
	
	private int balance;
	private int firstDeposit;
	private int firstDraw;
	private int secondDeposit;
	private int secondDraw;
	private int interessi;
	private int impostaBollo;
	
	

	public AccountUnicredit(int balance, int firstDeposit, int firstDraw, int secondDeposit, int secondDraw,
			int interessi, int impostaBollo) {
		super();
		this.balance = balance;
		this.firstDeposit = firstDeposit;
		this.firstDraw = firstDraw;
		this.secondDeposit = secondDeposit;
		this.secondDraw = secondDraw;
		this.interessi = interessi;
		this.impostaBollo = impostaBollo;
	}

	@Override
	public int getFirstDeposit() {

		return balance + firstDeposit;
	}

	@Override
	public int getFirstDraw() {

		return getFirstDeposit() - firstDraw;
	}

	@Override
	public int getSecondDeposit() {

		return getFirstDraw() + secondDeposit;
	}

	@Override
	public int getSecondDraw() {

		return getSecondDeposit() - secondDraw;
	}

	public int getInteressi() {
		return getSecondDraw() * interessi / 100;
	}
	
	@Override
	public int getImpostaBollo() {
		return getSecondDraw() - (getInteressi() + impostaBollo);
	}
	
	@Override
	public int getTotalAccount() {

		return getSecondDraw() - getInteressi();
	}
	

	public static void main(String[] args) {
		
		AccountUnicredit a = new AccountUnicredit(0,400,100,80,20,10,34);
		
		System.out.println(a.getTotalAccount());
		
		


	}

}
