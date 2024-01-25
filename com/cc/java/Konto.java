package com.cc.java;

public class Konto {

    private int kontoStand;

    // public Konto(){
    //     this.kontoStand = 1000;
    // }

    // public void verdoppeln(){
    //     this.kontoStand *= 2;
    // }

    // public void verdreifachen(){
    //     this.kontoStand *= 3;
    // }

    // public void verzehnfachen(){
    //     this.kontoStand *= 10;
    // }

    // public int getKontostand(){
    //     this.kontoStand;
    // }
    
    public Konto(int kontoStand) {
        this.kontoStand = kontoStand;
    }

    public int getKontostand(){
        return kontoStand;
    }

    public void setKontostand(int kontoStand){
        this.kontoStand = kontoStand;

    }

}
