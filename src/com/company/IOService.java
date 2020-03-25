package com.company;

import java.util.Scanner;

public class IOService {

    Scanner in;

    public IOService(){
        in = new Scanner(System.in);
    }

    public String read(){
        String input = in.nextLine();
        return input;
    }

    public void print(double result){
        System.out.println(" = " + result);
    }

    public double[] getOperands(String input){

        String[] def = input.split(" ");
        double a = Double.parseDouble(def[0]);
        double b = Double.parseDouble(def[2]);

        double[] pair = {a ,b};
        return pair;
    }

    public String getOpperator(String input){
        String[] def = input.split(" ");
        return def[1];
    }
}
