package com.oop.classes.intro;

public class SecondAccount extends FirstAccount{
	
	private int canoneAnnuo;

	public void setCanoneAnnuo(int canoneAnnuo) {
		this.canoneAnnuo = canoneAnnuo;
	}
	
	public int getCanoneAnnuo() {
		return getTotalAccount() * canoneAnnuo / 100;
	}
	
	public int getFinalAccount() {
		return getTotalAccount() - getCanoneAnnuo(); 
	}

}
