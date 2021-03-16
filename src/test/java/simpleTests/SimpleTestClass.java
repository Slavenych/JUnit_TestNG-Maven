package simpleTests;

import application.Calculator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

@Category ( Regression.class )
public class SimpleTestClass {

  Calculator calc = new Calculator();

  @Test
  public void testAddTwoPositiveValues() {
    int actualResult = calc.add(10, 5);
    assertEquals("10 + 5 must be 15", 15, actualResult);
  }

  // TODO (*)
  //add tests for new methods (multiply, division, subtraction, square root, x^2)

  @Test
  public void testSubtraction(){
    int actualResult = calc.subtractionMethodAdd ( 100, 33 );
    assertEquals ("100 - 33 = 67",65, actualResult);
  }
  @Test
  public void testMultiplication(){
    int actualResult = calc.multiplicationMethodAdd ( 10,3 );
    assertEquals ( "10 * 3 = 30", 31, actualResult );
  }
  @Test
  public void testDivision(){
    int actualResult = calc.divisionMethodAdd ( 100,10 );
    assertEquals ( "100 / 10 = 10",10, actualResult );
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



