package com.oop.classes.intro;

//EREDITARIETA'

public class SonAccount extends MotherAccount{
	
	private int canoneAnnuo;
	
	
	

	public SonAccount(int balance, int firstDeposit, int secondDeposit, int firstDraw, int secondDraw, int canoneAnnuo) {
		super(balance, firstDeposit, secondDeposit, firstDraw, secondDraw);
		this.canoneAnnuo = canoneAnnuo;
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
	
	public int getSecondDraw() {
		return getSecondDeposit() - secondDraw;
	}
	
	public int getCanoneAnnuo() {
		return getSecondDraw() * canoneAnnuo / 100;
	}
	
	@Override
	public int getTotalAccount() {
		return getSecondDraw() - getCanoneAnnuo();
	}
	

	

}
