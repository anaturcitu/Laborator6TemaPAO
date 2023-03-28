package util;

import exception.DivideByZeroException;

public class MathOperations {


    public static double divideTwoNumbers(double a, double b){
        try {
            if (b == 0)
                throw new DivideByZeroException("b nu poate fi 0");
        }
        catch (DivideByZeroException exception){
            System.out.println(exception.getMessage());
        }
        return a/b;
    }

}
