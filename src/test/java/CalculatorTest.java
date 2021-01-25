import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

  Calculator calculator = new Calculator();

  @Test
  public void canAdd(){
      assertEquals(8, calculator.add(4,4));
  }

  @Test
  public void canSubtract(){
      assertEquals(10, calculator.subtract(15, 5));
  }

  @Test
  public void canMultiply(){
    assertEquals(4, calculator.multiply(2, 2));
  }

  @Test
  public void canDivide(){
    assertEquals(2, calculator.divide(10, 5), 0.01);
  }


}
