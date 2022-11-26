package com.unipi.msc;

import com.unipi.msc.factory.Computer;
import com.unipi.msc.model.Desktop;
import com.unipi.msc.model.Laptop;
import com.unipi.msc.model.Store;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------- o --------------------");
        System.out.println("Welcome to the first Java Exercise for Msc");
        System.out.println("------------------- o --------------------");
        Store store = Store.getInstance();
        store.createCustomers(getUserInput("Give me the number of customers    ( >= 3 ) :"));
        store.createComputers(getUserInput("Give me the number of available pc ( >= 3 ) :"));
    }

    private static int getUserInput(String msg){
        Scanner mySca = new Scanner(System.in);
        int result;
        do {
            System.out.println(msg);
            while (!mySca.hasNextInt()) {
                System.out.println("That's not a number!");
                mySca.next();
            }
            result = mySca.nextInt();
        }while (result<=2);
        return result;
    }
}
