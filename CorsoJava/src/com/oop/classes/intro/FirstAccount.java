package com.oop.classes.intro;

public class FirstAccount {
	
	protected int balance;
	protected int firstDeposit;
	protected int secondDeposit;
	protected int firstDraw;
	protected int secondDraw;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getFirstDeposit() {
		return balance + firstDeposit;
	}
	
	public int getTotalAccount() {
		return getSecondDeposit() - secondDraw;
	}
	public void setFirstDeposit(int firstDeposit) {
		this.firstDeposit = firstDeposit;
	}
	public int getSecondDeposit() {
		return getFirstDraw() + secondDeposit;
	}
	public void setSecondDeposit(int secondDeposit) {
		this.secondDeposit = secondDeposit;
	}
	public int getFirstDraw() {
		return getFirstDeposit() - firstDraw;
	}
	public void setFirstDraw(int firstDraw) {
		this.firstDraw = firstDraw;
	}
	public void setSecondDraw(int secondDraw) {
		this.secondDraw = secondDraw;
	}
	
	

}
