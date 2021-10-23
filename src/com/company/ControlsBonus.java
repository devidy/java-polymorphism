package com.company;

public class ControlsBonus {
  private double sum;

  public double getSum() {
    return sum;
  }

  public void register(Employee employee) {
    this.sum += employee.getBonus();
  }


}
