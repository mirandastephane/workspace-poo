package entities;

import java.util.ArrayList;
import java.util.List;


public class Seller extends Employee{
    public Manager manager;
    protected List<Sale> sales = new ArrayList<>();
    protected double totalSales;
    protected double commissionSeller;
    protected double totalCommission;

    public Seller(String name, int age, String cpf, String role, double salary, Manager manager, double totalSales, double commissionSeller, double totalCommission) {
        super(name, age, cpf, role, salary);
        this.manager = manager;
        this.totalSales = totalSales;
        this.commissionSeller = commissionSeller;
        this.totalCommission = totalCommission;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }

    public double getTotalSales() {
        for(int i = 0 ;i < sales.size(); i++){
            totalSales += sales.get(i).saleValue ;
        }
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getCommissionSeller() {
        return commissionSeller;
    }

    public void setCommissionSeller(double commissionSeller) {
        this.commissionSeller = commissionSeller;
    }

    public double getTotalCommission() {
        totalCommission = totalSales * commissionSeller;
        return totalCommission;
    }

    public void setTotalCommission(double totalCommission) {
        this.totalCommission = totalCommission;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public double getSalary() {
        salary += totalCommission;
        return salary;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "manager=" + manager +
                "sales=" + sales +
                "totalSales=" + totalSales +
                "commissionSeller=" + commissionSeller +
                "totalCommission=" + totalCommission +
                "} " + super.toString();
    }
}
