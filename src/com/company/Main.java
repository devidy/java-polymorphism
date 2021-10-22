package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      newManager();
    }

    public static void newManager() {
      Manager manager = new Manager();
      manager.setName("Marco Túlio");
      manager.setCpf("546456546");
      manager.setSalary(9000.00);

      System.out.println(manager.getName());
      System.out.println(manager.getCpf());
      System.out.println(manager.getSalary());

      manager.setPassword(5454);

      System.out.println(manager.authenticate(5454));
      System.out.println(manager.getBonus());
    }

    public static void newEmployee() {
      Employee employee = new Employee();

      employee.setName("Devidy Oliveira");
      employee.setCpf("9804209238");
      employee.setSalary(8442.87);

      System.out.println(employee.getName());
      System.out.println(employee.getBonus());

    }
}
