package entities;

public class Employee extends Person {
    protected String role;
    protected double salary;

    public Employee(String role, double salary) {
        this.role = role;
        this.salary = salary;
    }

    public Employee(String name, int age, String role, double salary) {
        super(name, age);
        this.role = role;
        this.salary = salary;
    }

    public Employee(String name, int age, String cpf, String role, double salary) {
        super(name, age , cpf);
        this.role = role;
        this.salary = salary;
    }

    public String getCargo() {
        return role;
    }

    public void setCargo(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "role='" + role + '\'' +
                "salary=" + salary +
                "} " + super.toString();
    }
}