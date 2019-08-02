package com.ds.list;

import java.util.*;

public class EmployeeApplication {

    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        Employee harshal=new Employee(1,"harshal",78);
        Employee priya=new Employee(2,"Priya",89);
        employees.add(harshal);
        employees.add(priya);


        Employee random=new Employee(1,"harshal",78);
        System.out.println(employees.indexOf(random));
        System.out.println(employees.indexOf(harshal));

        System.out.println("Check random and harshal equity: "+harshal.equals(random));
        Set<Employee> employeeSet=new HashSet<>();
        System.out.println("Adding harshal: "+employeeSet.add(harshal));
        System.out.println("Adding like harhal: "+employeeSet.add(random));
        System.out.println("Adding priya : "+employeeSet.add(priya));
        System.out.println("length is: "+employeeSet.size());

        System.out.println("on set: "+employees.contains(random));

        System.out.println("--------------------------TREE SET---------------------------------");
        TreeSet<Employee> employeeTreeSet=new TreeSet<>();
        System.out.println("Adding harshal in TRESET: "+employeeTreeSet.add(harshal));
        System.out.println("Adding harshal LIKE in TRESET: "+employeeTreeSet.add(random));
        System.out.println("Adding PRIYA IN TREE SET : "+employeeTreeSet.add(priya));

        System.out.println("In treeSet: "+employeeTreeSet.contains(random));
        System.out.println("Length Of TRESSET: "+employeeTreeSet.size());
    }
}
