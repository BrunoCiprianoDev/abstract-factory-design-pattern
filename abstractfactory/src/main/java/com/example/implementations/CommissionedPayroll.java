package com.example.implementations;

import com.example.interfaces.Payroll;

public class CommissionedPayroll implements Payroll {

  @Override
  public String calculate() {
    return "Calculate ComissionedPayroll";
  }

}
