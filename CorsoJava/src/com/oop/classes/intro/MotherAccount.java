package com.oop.classes.intro;

public class MotherAccount {
	
	protected int balance;
	protected int firstDeposit;
	protected int secondDeposit;
	protected int firstDraw;
	protected int secondDraw;
	
	

	public MotherAccount(int balance, int firstDeposit, int secondDeposit, int firstDraw, int secondDraw) {
		super();
		this.balance = balance;
		this.firstDeposit = firstDeposit;
		this.secondDeposit = secondDeposit;
		this.firstDraw = firstDraw;
		this.secondDraw = secondDraw;
	}
	
	public int getFirstDeposit() {
		return balance + firstDeposit;
	}
	
	public int getFirstDraw() {
		return getFirstDeposit() - firstDraw;
	}
	
	public int getSecondDeposit() {
		return getFirstDraw() + secondDeposit;
	}
	
	public int getTotalAccount() {
		return getSecondDeposit() - secondDraw;
	}
	

}
