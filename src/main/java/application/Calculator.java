package application;

public class Calculator {

    //***************Simple methods************************

    public int add ( int a, int b ) {
        return a + b;
    }

    //TODO add method for subtraction

    public int subtractionMethodAdd ( int a, int b ) {
        return a - b;
    }

    //TODO add method for multiplication

    public int multiplicationMethodAdd ( int a, int b ) {
        return a * b;
    }

    //TODO add method for division

    public int divisionMethodAdd ( int a, int b ) {
        return a / b;
    }

    //TODO add method for square root (use Math class)

    public double squareRootMethod ( int a ) {
        return Math.sqrt ( a );
    }

    //TODO add method for x^2

    public double mathPow ( int a, int b ) {
        return Math.pow ( a, b );

    }
    //***************Medium methods************************

    //TODO (*) |average value| add method which calculate average value of 3 numbers

    public int avarageValue ( int x, int y, int z ) {
        return x + y + z / 3;
    }

    //TODO (*) |even or odd| add method which get 1 number as parameter and return true if it even, and false - if odd

    public boolean evenOrOdd ( int num ) {
        if ( num % 2 == 0 ) {
            return true;
        }
        return false;
    }

    //TODO (*) |biggest value| add method which get 2 number as parameters and return bigger of them, or 0 if they equals

    public static int biggestValue ( int numOne, int numTwo ) {
        if ( numOne > numTwo ) {
            return numOne;
        } else if ( numOne < numTwo ) {
            return numTwo;
        } else return 0;
    }

    //***************Hard methods************************

    //TODO (**) |addition with multiple parameters| add method which return sum of any quantity of parameter

    public int sumAll(int...numbers){

        int result = 0;
        for(int i = 0 ; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    //TODO (*) |divide by zero case| add method for division (check division by zero case
    // - if we try to divide by zero - return -100;

    public static int divideByZero(int div1, int div2){
        try {
            return div1/div2;
        }
        catch ( ArithmeticException e ){
            System.out.print ("Divided by zero operation cannot possible: ");
            return -100;
        }
    }

}













