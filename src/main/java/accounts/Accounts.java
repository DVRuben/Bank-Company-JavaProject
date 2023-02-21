/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

public class Accounts {

    public static void main(String[] args) {
        
        /*Account emanueleAccount = new Account();
        Account claudioAccount = new Account();
        
        emanueleAccount.setAmount(100);
        System.out.println(emanueleAccount.getAmount());
        emanueleAccount.transferTo(claudioAccount, -70);
        System.out.println(emanueleAccount.getAmount());
        System.out.println(claudioAccount.getAmount());*/
        
        Company company = new Company("CGM");
        Employee luigi = new Developer("Luigi", new Account(), "Java", 1100.00);
        Employee luca = new Developer("Luca", new Account(), "JavaScript", 1700.00);
        company.addEmployee(luigi);
        company.addEmployee(luca);
        company.getCurrentAcc().setAmount(20000);
        company.payEmployees();
        System.out.println(luigi.getCurrentAcc().getAmount());
        System.out.println(company.getCurrentAcc().getAmount());
        System.out.println(luca.getCurrentAcc().getAmount());
        
    }
    
}
