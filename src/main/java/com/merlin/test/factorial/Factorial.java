package com.merlin.test.factorial;

public class Factorial {

    public Integer findSumOfFactorial(final int n) {

        final int factorial = findFactorial(n);

        final char[] factorialArray = intToArray(factorial);

        return getDigitsSum(factorialArray);
    }

    private Integer getDigitsSum(final char[] factorialArray) {

        int result = 0;

        for (final char c : factorialArray) {
            result += Character.getNumericValue(c);
        }
        return result;
    }

    private char[] intToArray(final Integer factorial) {

        return factorial.toString().toCharArray();
    }

    private int findFactorial(final int n) {

        if(n < 0) {
            System.out.println("No es posible calcular el factorial de un numero menor que cero, se calcula de su valor absoluto");
            return findFactorial(n * -1);
        }
        if(n == 0) {
            return 1;
        }
        return n * findFactorial(n -1);
    }
}
