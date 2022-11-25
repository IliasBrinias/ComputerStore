package com.unipi.msc.factory;

import com.unipi.msc.interfaces.ComputerAbstractFactory;
import com.unipi.msc.model.Laptop;

public class LaptopFactory implements ComputerAbstractFactory {
    private final double screenSize;
    private final String model;
    private final String price;
    private final String battery;
    private final String camera;

    public LaptopFactory(double screenSize, String model, String price, String battery, String camera) {
        this.screenSize = screenSize;
        this.model = model;
        this.price = price;
        this.battery = battery;
        this.camera = camera;
    }

    @Override
    public Computer createComputer() {
        return new Laptop(screenSize,model,price, battery, camera);
    }
}
