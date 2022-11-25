package com.unipi.msc.factory;

import com.unipi.msc.interfaces.ComputerAbstractFactory;
import com.unipi.msc.model.Desktop;

public class DesktopFactory implements ComputerAbstractFactory {
    private final double screenSize;
    private final String model;
    private final String price;

    public DesktopFactory(double screenSize, String model, String price) {
        this.screenSize = screenSize;
        this.model = model;
        this.price = price;
    }

    @Override
    public Computer createComputer() {
        return new Desktop(screenSize,model,price);
    }
}
