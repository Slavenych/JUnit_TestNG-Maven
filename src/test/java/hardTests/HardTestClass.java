package hardTests;

import application.Calculator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class HardTestClass {

  Calculator calc = new Calculator();

  //TODO (**)
  //add tests for new method - divide by zero case

  @Test
  public void testDivideByZero ( ) {
    int actualResult = calc.divideByZero ( 1, 0 );
    int expectedResult = - 100;
    assertEquals ( expectedResult, actualResult );
  }

  //TODO (**)
  //add tests for new method - addition with multiple parameters
  @Test
  public void testSumAll ( ) {
    int actualResult = calc.sumAll ( 1, 2, 3, 4, 5 );
    int expectedResult = 15;
    assertEquals ( expectedResult, actualResult );
  }

}
