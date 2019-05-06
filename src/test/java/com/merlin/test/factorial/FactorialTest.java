package com.merlin.test.factorial;

public class FactorialTest {

    public static void findSumOfFactorialTest() {

        final Factorial factorial = new Factorial();

        final int n = 5;

        final int sum = factorial.findSumOfFactorial(5);

        System.out.println(sum);
    }

    public static void main(final String[] args) {

        findSumOfFactorialTest();
    }
}
