package application;

import java.util.ArrayList;
import java.util.List;

import entities.*;

public class main {
    public static void main(String[] args) {

        Manager manager = new Manager("Sophia Maria Aparício",51,"25948039285","Gerente Regional",7584.20, 0.15,"Norte-Nordeste",0); 
        Seller saller = new Seller("Rayssa Julia Porto",72,"86802952564","Vendedora Interna", 3500.00, manager,0,0.05,0);
        Seller saller2 = new Seller("Agatha Catarina Renata Vieira",47,"34816626700","Vendedora Interna", 3500.00, manager,0,0.05,0);

        List<Sale> sales = new ArrayList<>();
        List<Sale> sales02 = new ArrayList<>();
        List<Seller> salesPeople = new ArrayList<>();

      
        salesPeople.add(saller);
        salesPeople.add(saller2);

    
        manager.setSalesPeople(salesPeople);

        Sale sales1 = new Sale(100);
        Sale sales2 = new Sale(235);
        Sale sales3 = new Sale(985);
        Sale sales4 = new Sale(325);
        Sale sales5 = new Sale(985);
        Sale sales6 = new Sale(258);
        Sale sales7 = new Sale(357);
        Sale sales8 = new Sale(753);
        Sale sales9 = new Sale(1500);
        Sale sales10 = new Sale(1500);

    
        sales.add(sales1);
        sales.add(sales2);
        sales.add(sales3);
        sales.add(sales4);
        sales.add(sales5);

 
        sales02.add(sales6);
        sales02.add(sales7);
        sales02.add(sales8);
        sales02.add(sales9);
        sales02.add(sales10);

        saller.setSales(sales);

        saller2.setSales(sales02);

        saller.getTotalSales();
        saller.getTotalCommission();

        saller.getTotalSales();
        saller2.getTotalCommission();

        manager.getCommissionTotalManager();

        System.out.println();
        System.out.println(saller.getName()+"\n***********Sale***********\n"+saller.getSales());
        System.out.println();
        System.out.println("Salário: R$ " + saller.getSalary());
        System.out.println();
        System.out.println(saller2.getName()+"\n***********Sale***********\n"+saller2.getSales());
        System.out.println();
        System.out.println("Salário: R$ " + saller.getSalary());
        System.out.println();
        System.out.println(manager.getName()+"\nSalário: R$ " +manager.getSalary());

    }
}