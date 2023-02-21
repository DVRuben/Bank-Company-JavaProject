/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

public class Company {
    private String name;
    private int employeesCount;
    private Employee[] employees;
    private Account currentAcc;

    public Company(String name) {
        this.name = name;
        this.employeesCount = 0;
        this.employees = new Employee[15];
        this.currentAcc = new Account();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getCurrentAcc() {
        return currentAcc;
    }

    public void addEmployee(Employee hiredEmployee){
        if(employees.length > employeesCount){
            employees[employeesCount] = hiredEmployee;
            employeesCount++;
        }
    }
    
    public double payEmployees(){
        for(int i = 0; i < employeesCount; i++){
            this.currentAcc.transferTo(employees[i].getCurrentAcc(), employees[i].getSalary());
        }
        return currentAcc.getAmount();
    }
}
