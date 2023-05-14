package com.generic.tests;

public class GenericsUsefulClass<G> {

    private G powerful;

    public GenericsUsefulClass(G powerful) {
        this.powerful = powerful;
    }
    public GenericsUsefulClass(){

    }

    public G getPowerful() {
        return powerful;
    }

    public void setPowerful(G powerful) {
        this.powerful = powerful;
    }

    public void getData() {
        System.out.println(powerful.getClass().getName());
    }


}



