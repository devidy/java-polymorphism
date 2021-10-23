package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      ControlsBonus controlsBonus = new ControlsBonus();
      controlsBonus.register(newManager());
      controlsBonus.register(newDesigner());
      controlsBonus.register(newVideoEditor());

      System.out.println(controlsBonus.getSum());
    }

    public static Manager newManager() {
      Manager manager = new Manager();
      manager.setName("Marco Túlio");
      manager.setCpf("546456546");
      manager.setSalary(9000.00);

      return manager;
    }

  public static Designer newDesigner() {
    Designer designer = new Designer();

    designer.setName("Marco Túlio");
    designer.setCpf("546456546");
    designer.setSalary(9000.00);

    return designer;
  }

  public static VideoEditor newVideoEditor() {
    VideoEditor videoEditor = new VideoEditor();

    videoEditor.setName("Marco Túlio");
    videoEditor.setCpf("546456546");
    videoEditor.setSalary(9000.00);

    return videoEditor;
  }

  public static Employee newEmployee() {
    Employee employee = new Employee();

    employee.setName("Devidy Oliveira");
    employee.setCpf("9804209238");
    employee.setSalary(8442.87);

    return employee;
  }
}
