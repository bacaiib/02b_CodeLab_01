package com.cc.java;

public class App {
    
    public static void main(String[] args) {

    
        Konto konto1 = new Konto(10000);
        Konto konto2 = new Konto(10000);
        Konto konto3 = new Konto(10000);

        output(konto1.getKontostand() *2);
        output(konto2.getKontostand() *3);
        output(konto3.getKontostand() *10);
    
    }


    private static void output(int outputStr) {
        System.out.println(outputStr);
    } 

}




        // Konto konto1 = new Konto();
        // Konto konto2 = new Konto();
        // Konto konto3 = new Konto();

        // output(Integer.valueOf(konto1.getKontostand()));

