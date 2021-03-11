package com.company;

public class Garage <C extends Car> implements Movable <C>{

    private C car;

    public C getCar() { return car; }

    public void setCar(C car) { this.car = car; }

    @Override
    public C move(C c) {
        System.out.println(c.getClass().getSimpleName()+
                " moved into the garage" );
        return car; }

    @Override
    public C move() {
        System.out.println(getCar().getClass().getSimpleName()+
                " moved out from the garage");
        return car;
    }
}
