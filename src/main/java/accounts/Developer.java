/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

public class Developer extends AbstractEmployee{
    private String language;
    private double salary;

    public Developer(String fullName, Account currentAcc, String language, double salary) {
        super(fullName, currentAcc);
        this.language = language;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
