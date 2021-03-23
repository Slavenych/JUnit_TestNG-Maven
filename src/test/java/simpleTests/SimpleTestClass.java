package simpleTests;

import application.Calculator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class SimpleTestClass {

  Calculator calc = new Calculator();
//this is first example test.
  @Test
  public void testAddTwoPositiveValues() {
    int actualResult = calc.add(10, 5);
    assertEquals("10 + 5 must be 15", 15, actualResult);
  }

  // TODO (*)
  //add tests for new methods (multiply, division, subtraction, square root, x^2)

  @Test
  public void testSubtraction ( ) {
    int actualResult = calc.subtractionMethodAdd ( 100, 33 );
    int expectedResult = 67;
    assertEquals ( "100 - 33 = 67", expectedResult, actualResult );
  }

  @Test
  public void testMultiplication ( ) {
    int actualResult = calc.multiplicationMethodAdd ( 10, 3 );
    int expectedResult = 30;
    assertEquals ( "10 * 3 = 30", expectedResult, actualResult );
  }

  @Test
  public void testDivision ( ) {
    int actualResult = calc.divisionMethodAdd ( 100, 10 );
    int expectedResult = 10;
    assertEquals ( "100 / 10 = 10", expectedResult, actualResult );
  }

//  @Test
//  public void testSquareRoot(){
//    double actualResult = calc.squareRootMethod ( 20 );
//    assertEquals ( 4.47213595499958, actualResult == 4.47213595499958);
//    }
//  @Test
//  public void testMathPow(){
//    double actualResult = calc.mathPow ( 10,2 );
//    assertEquals ( "10 20", 1000, actualResult );
//  }

}



