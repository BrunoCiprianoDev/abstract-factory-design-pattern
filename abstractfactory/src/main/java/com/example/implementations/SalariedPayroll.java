package com.example.implementations;

import com.example.interfaces.Payroll;

public class SalariedPayroll implements Payroll {

  @Override
  public String calculate() {
    return "Calculate SalariedPayroll";
  }

}
