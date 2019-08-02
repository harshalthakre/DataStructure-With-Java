package com.ds.list;

public class Employee implements Comparable{
    private int id;
    private String name;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public int compareTo(Object o) {
        Employee employee=(Employee)o;
        return this.name.compareTo(employee.name);
    }

    @Override
    public boolean equals(Object obj) {
        Employee e=(Employee)obj;
        return this.salary==e.salary?true:false;
    }

    @Override
    public int hashCode() {
        return 98;
    }

    public Animal getAnal(Animal a){
        return null;
    }

    public Animal getAnal(Dog d){
        return null;
    }
}


class Manager extends Employee{

    /*@Override
    public Dog getAnal() {
        return new Dog();
    }*/
}

class Animal{

}

class Dog extends Animal{

}