package com.example.implementations;

import com.example.interfaces.AbstractFactory;
import com.example.interfaces.Historic;
import com.example.interfaces.Payroll;

public class Lawyer {

  private Payroll payroll;
  private Historic historic;

  public Lawyer(AbstractFactory abstractFactory) {
    this.payroll = abstractFactory.getPayment();
    this.historic = abstractFactory.getHistoric();
  }

  public Payroll getPayroll() {
    return payroll;
  }

  public void setPayroll(Payroll payroll) {
    this.payroll = payroll;
  }

  public Historic getHistoric() {
    return historic;
  }

  public void setHistoric(Historic historic) {
    this.historic = historic;
  }

}
