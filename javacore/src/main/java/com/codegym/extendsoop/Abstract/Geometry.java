package com.codegym.extendsoop.Abstract;

public abstract class Geometry {
    protected CreateDegrees toaDo;

    public Geometry(CreateDegrees toaDo) {
        this.toaDo = toaDo;
    }

    public CreateDegrees getToaDo() {
        return toaDo;
    }

    public void setToaDo(CreateDegrees toaDo) {
        this.toaDo = toaDo;
    }

    public abstract double Area();
}
