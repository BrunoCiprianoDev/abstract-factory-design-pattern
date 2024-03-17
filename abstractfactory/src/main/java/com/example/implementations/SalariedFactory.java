package com.example.implementations;

import com.example.interfaces.AbstractFactory;
import com.example.interfaces.Historic;
import com.example.interfaces.Payroll;

public class SalariedFactory implements AbstractFactory {

  public SalariedFactory() {
  }

  @Override
  public Payroll getPayment() {
    return new SalariedPayroll();
  }

  @Override
  public Historic getHistoric() {
    return new HistoricSalaried();
  }

}
