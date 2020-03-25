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
            default:
                throw new Exception("Unknown arithmetics sign");
        }
    }
}
