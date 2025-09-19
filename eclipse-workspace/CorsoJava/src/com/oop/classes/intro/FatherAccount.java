package com.oop.classes.intro;

public class FatherAccount {
    
    private int balance;
    private int firstDeposit;
    private int firstDraw;
    private int secondDeposit;
    private int secondDraw;
    
    
    public int getBalance() {
        return balance;
    }
    
    
    public int getFirstDeposit() {
        return firstDeposit;
    }
    
    
    public int getFirstDraw() {
        return firstDraw;
    }
    
    
    
    
    public int getSecondDeposit() {
        return secondDeposit;
    }
    
    public int getSecondDraw() {
        return secondDraw;
    }
    
    
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getNewFirstDeposit() {
        return balance + firstDeposit;
    }
    public void setFirstDeposit(int firstDeposit) {
        this.firstDeposit = firstDeposit;
    }
    public int getNewFirstDraw() {
        return getNewFirstDeposit() - firstDraw;
    }
    public void setFirstDraw(int firstDraw) {
        this.firstDraw = firstDraw;
    }
    public int getNewSecondDeposit() {
        return getNewFirstDraw() + secondDeposit;
    }
    public void setSecondDeposit(int secondDeposit) {
        this.secondDeposit = secondDeposit;
    }
    public int getTotalAccount() {
        return getNewSecondDeposit() - secondDraw;
    }
    public void setSecondDraw(int secondDraw) {
        this.secondDraw = secondDraw;
    }
    
    

}