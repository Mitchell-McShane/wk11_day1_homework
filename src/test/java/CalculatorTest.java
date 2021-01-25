import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

  Calculator calculator = new Calculator();

  @Test
    public void canAdd(){
      assertEquals(8, calculator.add(4,4));
  }
}
