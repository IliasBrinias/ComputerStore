package com.unipi.msc.model;

import com.unipi.msc.constants.ComputerSpecs;
import com.unipi.msc.factory.Computer;
import com.unipi.msc.factory.ComputerFactory;
import com.unipi.msc.factory.DesktopFactory;
import com.unipi.msc.factory.LaptopFactory;
import com.unipi.msc.interfaces.ComputerListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Store {
    private final Random r;
    private final List<ComputerListener> computerListeners = new ArrayList<>();
    private Store(){r=new Random();}
    private static Store instance;
    public static synchronized Store getInstance(){
        if (instance == null){
            instance = new Store();
        }
        return instance;
    }
    public void createComputers(int computerCount){
        int random = r.nextInt(0,computerCount+1);
        for (int i=0; i<computerCount; i++){
            Computer c;
            if (i<=random){
                c = ComputerFactory.getComputer(
                        new DesktopFactory(ComputerSpecs.getRandomScreenRatio(r),
                                ComputerSpecs.getRandomDesktopModel(r),
                                ComputerSpecs.getRandomPrice(r)));
            }else {
                c = ComputerFactory.getComputer(
                        new LaptopFactory(ComputerSpecs.getRandomScreenRatio(r),
                                ComputerSpecs.getRandomLaptopModel(r),
                                ComputerSpecs.getRandomPrice(r),
                                ComputerSpecs.getRandomBattery(r),
                                ComputerSpecs.getRandomCamera(r)));
            }
            computer2Customer(c);
        }
        notifyRestCustomers();
    }

    private void notifyRestCustomers() {
        for (ComputerListener c:computerListeners) {
            c.outOfStock();
        }
    }

    public void createCustomers(int customersCount){
        for (int i=0; i<customersCount; i++){
            Customer c = new Customer("Customer "+i,ComputerSpecs.getRandomCustomerChoice(r));
            computerListeners.add(c);
        }
    }
    private void computer2Customer(Computer computer){
        for (ComputerListener listener :computerListeners) {
            if (listener.getChoice().equals(computer.getClass().getSimpleName())){
                listener.onComputerReceived(computer);
                computerListeners.remove(listener);
                return;
            }
        }
    }
}
