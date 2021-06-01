package entities;

public class Person {
    protected int age;
    protected String name;
    protected String  cpf;

    public Person() {
    }

    public Person(String name, int age) {
    	this.name = name;
    	this.age = age;
    }

    public Person(String name, int age, String cpf) {
    	this.name = name;
    	this.age = age;
        this.cpf = cpf;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name ='" + name + '\'' +
                ", age = " + age +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
