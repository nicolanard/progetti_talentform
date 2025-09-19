package com.oop.classes.intro;

public class DaughterAccount extends FatherAccount {
    
    private int canoneAnnuo;

    
    public void setCanoneAnnuo(int canoneAnnuo) {
        this.canoneAnnuo = canoneAnnuo;
    }

    
    
    
    public int getFirstDepositDaughter() {
        
        
        return getBalance() + getFirstDeposit();
        
    }
    


    public int getFirstDrawDaughter() {
        
        return getFirstDepositDaughter() - getFirstDraw();
    }
    
    
    public int getSecondDepositDaughter() {
        
        
        return getFirstDrawDaughter() + getSecondDeposit();
    }
    
    
    public int getSecondDrawDaughter() {
        
        return getSecondDepositDaughter() - getSecondDraw();
        
        
    }
    
    public int getCanoneAnnuo() {
        
        return getSecondDrawDaughter() * canoneAnnuo/100;
    }
    
    
    public int getTotalAccountDaughter() {
        
        return getSecondDrawDaughter() - getCanoneAnnuo();
    }
    
    
    
    

}