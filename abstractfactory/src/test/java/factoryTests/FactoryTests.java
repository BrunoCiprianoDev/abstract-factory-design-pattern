package factoryTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.implementations.Lawyer;
import com.example.implementations.CommissionedFactory;
import com.example.implementations.SalariedFactory;
import com.example.interfaces.AbstractFactory;

public class FactoryTests {

  @Test
  void shouldGenerateComissionedHistoric() {
    AbstractFactory abstractFactory = new CommissionedFactory();
    Lawyer attorney = new Lawyer(abstractFactory);
    assertEquals("Generate HistoricCommissioned", attorney.getHistoric().generate());
  }

  @Test
  void shouldGenerateSalariedHistoric() {
    AbstractFactory abstractFactory = new SalariedFactory();
    Lawyer attorney = new Lawyer(abstractFactory);
    assertEquals("Generate HistoricSalaried", attorney.getHistoric().generate());
  }

  @Test
  void shouldCalcSalariedPayroll() {
    AbstractFactory abstractFactory = new SalariedFactory();
    Lawyer attorney = new Lawyer(abstractFactory);
    assertEquals("Calculate SalariedPayroll", attorney.getPayroll().calculate());
  }

  @Test
  void shouldCalcCommissionedPayroll() {
    AbstractFactory abstractFactory = new CommissionedFactory();
    Lawyer attorney = new Lawyer(abstractFactory);
    assertEquals("Calculate ComissionedPayroll", attorney.getPayroll().calculate());
  }

}
