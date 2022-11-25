package com.unipi.msc.factory;

import com.unipi.msc.interfaces.ComputerAbstractFactory;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
