package com.company;

public class Main {

    public static void main(String[] args) {

        IOService ioService = new IOService();

        while(true){
            String input = ioService.read();
            if(input.equals("QUIT")) break;

            try{
                double result = Calculator.calculate(ioService.getOperands(input),
                        ioService.getOpperator(input));
                ioService.print(result);
            }
            catch(Exception e){
                System.out.println(" = " + e.getMessage());
            }
        }
    }
}
