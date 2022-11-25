package com.unipi.msc.model;

import com.unipi.msc.constants.ComputerSpecs;
import com.unipi.msc.factory.Computer;
import com.unipi.msc.interfaces.ComputerListener;

import java.util.Random;

public class Customer implements ComputerListener {
    private final String name;
    private final String choice;


    public Customer(String name, String choice) {
        this.name = name;
        this.choice = choice;
    }

    @Override
    public void onComputerReceived(Computer c) {
        System.out.println(" - - - - - - - - - - - - - - -");
        System.out.println(name+" received "+c);
        System.out.println(" opens ->" +ComputerSpecs.getRandomProgramBasedOnComputer(choice));
    }

    @Override
    public void outOfStock() {
        System.out.println(" - - - - - - - - - - - - - - -");
        System.out.println(name+" didn't receive his "+choice);
    }

    @Override
    public String getChoice() {
        return choice;
    }
}
