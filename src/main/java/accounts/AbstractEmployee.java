/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

public abstract class AbstractEmployee implements Employee{
    private String fullName;
    private Account currentAcc;

    public AbstractEmployee(String fullName, Account currentAcc) {
        this.fullName = fullName;
        this.currentAcc = currentAcc;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public Account getCurrentAcc(){
        return currentAcc;
    }
    
    public abstract double getSalary();
}
