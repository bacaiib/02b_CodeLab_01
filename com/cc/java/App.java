package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Konto konto1 = new Konto();
        // Konto konto2 = new Konto();
        // Konto konto3 = new Konto();

        // output(Integer.valueOf(konto1.getKontostand()));

    
        Konto konto1 = new Konto(10000 * 2);
        Konto konto2 = new Konto(10000 * 3);
        Konto konto3 = new Konto(10000 * 10);

        output(Integer.toString(konto1.getKontostand()));
        output(Integer.toString(konto2.getKontostand()));
        output(Integer.toString(konto3.getKontostand()));
    
    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    } 

}