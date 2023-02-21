/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

public class Account {
    private int IBAN;
    private double amount;

    public Account() {
    }
    
    public Account(int iban, double amount) {
        this.IBAN = iban;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public void transferTo(Account accTo, double amount){
        if(this.getAmount() >= amount && amount > 0){
            this.amount -= amount;
            accTo.amount += amount;
        }
    }
    
    public static void transferFrom(Account accFrom, Account accTo, double amount){
        accFrom.transferTo(accTo, amount);
    }
}
