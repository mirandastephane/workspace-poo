package entities;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    List<Seller> salesPeople = new ArrayList<>();
    protected double commissionManager;
    protected String setor;
    protected  double commissionTotalManager;

    public Manager(String name, int age , String cpf, String role, double salary, double commissionManager, String setor, double commissionTotalManager) {
        super(name, age , cpf, role, salary);
        this.commissionManager = commissionManager;
        this.setor = setor;
        this.commissionTotalManager = commissionTotalManager;
    }

    public List<Seller> getSalesPeople() {
        return salesPeople;
    }

    public void setSalesPeople(List<Seller> salesPeople) {
        this.salesPeople = salesPeople;
    }

    public double getCommissionManager() {
        return commissionManager;
    }

    public void setCommissionManager(double commissionManager) {
        this.commissionManager = commissionManager;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getCommissionTotalManager() {
        for(int i = 0; i < salesPeople.size(); i++){
            commissionTotalManager += salesPeople.get(i).totalSales * commissionManager;
        }
        return commissionTotalManager;
    }

    public void setCommissionTotalManager(double commissionTotalManager) {
        this.commissionTotalManager = commissionTotalManager;
    }

    @Override
    public double getSalary() {
        salary += commissionTotalManager;
        return salary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "salesPeople=" + salesPeople +
                "commissionSeller=" + commissionManager +
                "setor='" + setor + '\'' +
                "commissionTotalManager=" + commissionTotalManager +
                "} " + super.toString();
    }
}
