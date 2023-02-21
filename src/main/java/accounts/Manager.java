/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

public class Manager extends AbstractEmployee{
    private double salary;

    public Manager(String fullName, Account currentAcc, double salary) {
        super(fullName, currentAcc);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

}
