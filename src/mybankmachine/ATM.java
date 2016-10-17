/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybankmachine;

/**
 *
 * @author lukas
 */
public class ATM {
    String bankName;
    double balance;
    double moneyInOut;
    int interestDays;
    double interest;
    double interestRate;
    
    public ATM(){
        bankName = "Gringots";
        balance = 0;
        moneyInOut = 0;
        interestDays = 0;
        interest = 0;
    }
    
    public ATM(String bankNameInput, double balanceInput) {
        bankName = bankNameInput;
        balance = balanceInput;
        balance = 0;
        moneyInOut = 0;
        interestDays = 0;
        interest = 0;
    }
    
    public ATM(String bankNameInput, double balanceInput, double moneyInput, boolean isDeposit){
        bankName = bankNameInput;
        balance = balanceInput;
        moneyInOut = moneyInput;
        
        if (isDeposit = true) {
            balance += moneyInOut;
        }
        
        else if (isDeposit = false) {
            balance -= moneyInOut;
        }
    }
    
    public ATM(String bankNameInput, double balanceInput, int interestDaysInput, double interestRateInput){
        bankName = bankNameInput;
        balance = balanceInput;
        interestDays = interestDaysInput;
        interestRate = interestRateInput;
        
        interest = balanceInput * interestDaysInput * interestRateInput;
    }
}
