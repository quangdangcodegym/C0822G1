package com.codegym.sort;

public class Animal {
    private String name;
    private boolean isAlive;
    private int weight;

    public Animal(String name, boolean isAlive, int weight) {
        this.name = name;
        this.isAlive = isAlive;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", isAlive=" + isAlive +
                ", weight=" + weight +
                '}';
    }
}
