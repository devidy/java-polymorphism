package com.company;

public class Manager extends Employee{
  private int password;

  public void setPassword(int password) {
    this.password = password;
  }

  public boolean authenticate(int password) {
    if (this.password == password)
      return true;
    return false;
  }

  @Override
  public double getBonus() {
    return super.getSalary();
  }
}
