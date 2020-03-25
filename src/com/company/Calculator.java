package com.company;

import java.math.BigDecimal;

public class Calculator {

    public static double calculate(double[] opperands, String opperator) throws Exception {

        BigDecimal a = BigDecimal.valueOf(opperands[0]);
        BigDecimal b = BigDecimal.valueOf(opperands[1]);

        switch(opperator){
            case("+"):
                return a.add(b).doubleValue();
            case("-"):
                return a.subtract(b).doubleValue();
            case("*"):
                return a.multiply(b).doubleValue();
            case("/"):
                return a.divide(b).doubleValue();
            case ("^"):
                return degree(opperands[0], opperands[1]);
            case("log"):
                return log(opperands[0], opperands[1]);
            case ("div"):
                return div(a,b);
            case ("mod"):
                return mod(a,b);
            case ("sqrt"):
                return sqrt(opperands[0], opperands[1]);
            default:
                throw new Exception("Unknown arithmetics sign");
        }
    }

    private static double degree(double first, double second){
        return Math.pow(first, second);
    }

    private static double log(double first, double second){

        BigDecimal a = BigDecimal.valueOf(Math.log(first));
        BigDecimal b = BigDecimal.valueOf(Math.log(second));

        return a.divide(b).doubleValue();
    }

    private static double div(BigDecimal first, BigDecimal second){
        double var = first.divide(second).doubleValue();
        boolean lessThenZero = var < 0;
        var = lessThenZero ? -1*var : var;
        int div = 0;

        while (var >= 1){
            div++;
            var--;
        }

        return lessThenZero ? -1*div : div;
    }

    private static double mod(BigDecimal first, BigDecimal second){
        double div = div(first, second);
        return first.subtract(BigDecimal.valueOf(div).multiply(second)).doubleValue();
    }

    private static double sqrt(double first, double second){
        return degree(first, 1/second);
    }
}
