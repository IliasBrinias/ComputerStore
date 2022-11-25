package com.unipi.msc.model;

import com.unipi.msc.factory.Computer;

public class Desktop extends Computer {
    private final double screenSize;
    private final String model;
    private final String price;

    public Desktop(double screenSize, String model, String price) {
        this.screenSize = screenSize;
        this.model = model;
        this.price = price;
    }

    @Override
    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String getPrice() {
        return price;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void useComputer() {
        System.out.println("User just run a program");
    }

    @Override
    public String toString() {
        return "Desktop: " +model+ "("+
                    "screenSize=" + screenSize +
                    ", model='" + model + '\'' +
                    ", price='" + price +
                ")";
    }
}
