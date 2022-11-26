package com.unipi.msc.model;

import com.unipi.msc.constants.ComputerSpecs;
import com.unipi.msc.factory.Computer;

public class Laptop extends Computer {
    private final double screenSize;
    private final String model;
    private final String price;
    private final String battery;
    private final String camera;
    public Laptop(double screenSize, String model, String price, String battery, String camera) {
        this.screenSize = screenSize;
        this.model = model;
        this.price = price;
        this.battery = battery;
        this.camera = camera;
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
    public String useComputer() {
        return " opens -> " + ComputerSpecs.getRandomProgramBasedOnComputer(getClass().getSimpleName());
    }
    @Override
    public String toString() {
        return "Laptop: " +model+ "("+
                "screenSize=" + screenSize +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", battery='" + battery + '\'' +
                ", camera='" + camera + '\'' +
                ")\n" +
                useComputer();
    }
}
