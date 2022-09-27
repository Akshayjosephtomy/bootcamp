package com.nest.Hotel;


public class FoodItems {
    public static void main(String[] args) {

    }
    Integer tea,coffee,juice,BBQ,Alfaham;

    public FoodItems(Integer tea, Integer coffee, Integer juice, Integer BBQ, Integer alfaham) {
        this.tea = tea;
        this.coffee = coffee;
        this.juice = juice;
        this.BBQ = BBQ;
        Alfaham = alfaham;
    }

    public Integer getTea() {
        return tea;
    }

    public void setTea(Integer tea) {
        this.tea = tea;
    }

    public Integer getCoffee() {
        return coffee;
    }

    public void setCoffee(Integer coffee) {
        this.coffee = coffee;
    }

    public Integer getJuice() {
        return juice;
    }

    public void setJuice(Integer juice) {
        this.juice = juice;
    }

    public Integer getBBQ() {
        return BBQ;
    }

    public void setBBQ(Integer BBQ) {
        this.BBQ = BBQ;
    }

    public Integer getAlfaham() {
        return Alfaham;
    }

    public void setAlfaham(Integer alfaham) {
        Alfaham = alfaham;
    }
}
