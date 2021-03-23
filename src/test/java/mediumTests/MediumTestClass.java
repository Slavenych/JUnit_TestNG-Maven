package mediumTests;

import application.Calculator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;


public class MediumTestClass {

  Calculator calc = new Calculator();

  //TODO (**)
  //add tests for new method - average value
  @Test
  public void testAvarageValue ( ) {
    int actualResult = calc.avarageValue ( 10, 20, 30 );
    int expectedResult = 20;
    assertEquals ( "the avarege value is: ", expectedResult, actualResult );
  }

  //TODO (**)
  //add tests for new method - even or odd
  @Test
  public void testEvenOrOdd ( ) {
    boolean actualResult = calc.evenOrOdd ( 0 );
    boolean expectedResult = true;
    assertEquals ( expectedResult, actualResult );

  }

  //TODO (**)
  //add tests for new method - biggest value
  @Test
  public void testBiggestValue ( ) {
    int actualResult = calc.biggestValue ( 20, 20 );
    int expectedResult = 0;
    assertEquals ( expectedResult, actualResult );
  }

}
