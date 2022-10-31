package com.codegym.basic.extendsoop.compare.nghiacomparable;

public class Geometric {
    private String color = "white";
    private boolean filled = false;


    public Geometric() {
    }

    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


}
