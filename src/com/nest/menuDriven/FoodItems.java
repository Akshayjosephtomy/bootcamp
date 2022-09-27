package com.nest.menuDriven;

public class FoodItems {
    Integer tea;
    Integer coffee;
    Integer idli;
    Integer dosa;
    Integer juice;

    public FoodItems(Integer tea, Integer coffee, Integer idli, Integer dosa, Integer juice) {
        this.tea = tea;
        this.coffee = coffee;
        this.idli = idli;
        this.dosa = dosa;
        this.juice = juice;
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

    public Integer getIdli() {
        return idli;
    }

    public void setIdli(Integer idli) {
        this.idli = idli;
    }

    public Integer getDosa() {
        return dosa;
    }

    public void setDosa(Integer dosa) {
        this.dosa = dosa;
    }

    public Integer getJuice() {
        return juice;
    }

    public void setJuice(Integer juice) {
        this.juice = juice;
    }
}
