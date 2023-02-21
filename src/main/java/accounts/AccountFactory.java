/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

public class AccountFactory {
    
    private String name;
    private int nextIBAN;

    public AccountFactory(String name){
        this.name = name;
        this.nextIBAN = 0;
    }
    
    public Account newInstance(double amount){
        Account account = new Account(nextIBAN, amount);
        nextIBAN++;
        
        return account;
    }
}
