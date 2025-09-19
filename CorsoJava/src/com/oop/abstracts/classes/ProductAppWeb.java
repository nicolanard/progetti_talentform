package com.oop.abstracts.classes;

public class ProductAppWeb extends PreventivoAppWeb{
	
    private int tariffa;
    private int daysMockup;
    private int daysFigma;
    private int daysDbOffline;
    private int daysMultilanguage;
    private int daysResponsive;
    private String waitingTimes;

	@Override
	public int getDaysFigma() {
		return daysFigma;
	}

	@Override
	public int getDaysMockup() {

		return daysMockup;
	}

	@Override
	public int getDaysDbOffline() {

		return daysDbOffline;
	}

	@Override
	public int getDaysResponsive() {

		return daysResponsive;
	}

	@Override
	public String getWaitingTimes() {

		return waitingTimes;
	}

	@Override
	public int getDaysMultilanguage() {

		return daysMultilanguage;
	}

	@Override
	public int getCostoFigma() {

		return tariffa * getDaysFigma();
	}

	@Override
	public int getCostoMockup() {

		return tariffa * getDaysMockup();
	}

	@Override
	public int getCostoDbOffline() {

		return tariffa * getDaysDbOffline();
	}

	@Override
	public int getCostoResponsive() {

		return tariffa * getDaysResponsive();
	}

	@Override
	public int getCostoMultilanguage() {

		return tariffa * getDaysMultilanguage();
	}
	
public int getPriceApp() {
       
        return getCostoFigma() + getCostoMockup() + getCostoDbOffline() + getCostoResponsive() + getCostoMultilanguage();
    }

	public void setTariffa(int tariffa) {
		this.tariffa = tariffa;
	}

	public void setDaysMockup(int daysMockup) {
		this.daysMockup = daysMockup;
	}

	public void setDaysFigma(int daysFigma) {
		this.daysFigma = daysFigma;
	}

	public void setDaysDbOffline(int daysDbOffline) {
		this.daysDbOffline = daysDbOffline;
	}

	public void setDaysMultilanguage(int daysMultilanguage) {
		this.daysMultilanguage = daysMultilanguage;
	}

	public void setDaysResponsive(int daysResponsive) {
		this.daysResponsive = daysResponsive;
	}

	public void setWaitingTimesApp(String waitingTimes) {
		this.waitingTimes = waitingTimes;
	}
	

}
