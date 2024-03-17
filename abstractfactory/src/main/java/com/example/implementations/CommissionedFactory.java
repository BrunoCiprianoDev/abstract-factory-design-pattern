package com.example.implementations;

import com.example.interfaces.AbstractFactory;
import com.example.interfaces.Historic;
import com.example.interfaces.Payroll;

public class CommissionedFactory implements AbstractFactory {

  public CommissionedFactory() {

  }

  @Override
  public Payroll getPayment() {
    return new CommissionedPayroll();
  }

  @Override
  public Historic getHistoric() {
    return new HistoricCommissioned();
  }

}
