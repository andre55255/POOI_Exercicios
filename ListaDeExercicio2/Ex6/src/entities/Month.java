package entities;

import java.text.DecimalFormat;

public class Month {
    private String name;
    private double salary;
    private double spending;
    private double taxes;
    
    public Month() {
    }

    public Month(String name, double salary, double spending, double taxes) {
        this.name = name;
        this.salary = salary;
        this.spending = spending;
        this.taxes = taxes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSpending() {
        return spending;
    }

    public void setSpending(double spending) {
        this.spending = spending;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }
    
    public double balance() {
        return this.salary - this.spending - this.taxes;
    }
    
    public String toStringAll() {
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("###,###.00");
        
        sb.append("\nMês: ")
                .append(this.name)
                .append(", salário: R$ ")
                .append(df.format(this.salary))
                .append(", gastos: R$ ")
                .append(df.format(this.spending))
                .append(", impostos: R$ ")
                .append(df.format(this.taxes))
                .append(", saldo: R$ ")
                .append(df.format(this.balance()));
        
        return sb.toString();
    }
    
    public String toStringNameBalance() {
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("###,###.00");
        
        sb.append("\nMês: ")
                .append(this.name)
                .append(", saldo: R$ ")
                .append(df.format(this.balance()));
        
        return sb.toString();
    }
}