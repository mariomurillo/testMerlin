package com.merlin.test.selfpowers;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * The Class SelfPowers.
 */
public class SelfPowers {

    public static void main(final String args[]) {
        System.out.println("last ten digits of the series :" + lastTenDigits(-2));
    }

    private static String lastTenDigits(int number){

        final String numberString = "" + number;
        if (numberString.length() < 10) {
            return numberString.concat(", No cumple la longitud requerida");
        }
        BigInteger series = BigInteger.ZERO;
        if(number > 0) {
            for (int i = BigInteger.ONE.intValue(); i <= number; i++) {
                series = series.add(BigInteger.valueOf(i).pow(i));
            }

            final String lastTenDigits = series.toString();
            return lastTenDigits.substring(lastTenDigits.length() - 10);
        } else {
            number = number * -1;
            BigDecimal seriesDecimal = BigDecimal.ZERO;
            for (int i = BigInteger.ONE.intValue(); i <= number; i++) {
                seriesDecimal = seriesDecimal.add(BigDecimal.ONE.divide(BigDecimal.valueOf(i).pow(i)).negate());
            }

            final String lastTenDigits = seriesDecimal.toString();
            return lastTenDigits.substring(lastTenDigits.length() - 10);
        }
    }
}
