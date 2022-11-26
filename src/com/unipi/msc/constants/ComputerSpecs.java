package com.unipi.msc.constants;

import com.unipi.msc.model.Desktop;
import com.unipi.msc.model.Laptop;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class ComputerSpecs {
    public static double getRandomScreenRatio(Random r){
        return switch (r.nextInt(0, 4)) {
            case 0 -> 15.6;
            case 1 -> 13.4;
            case 2 -> 24;
            case 3 -> 27;
            default -> 0;
        };
    }
    public static String getRandomLaptopModel(Random r){
        return switch (r.nextInt(0, 4)) {
            case 0 -> "Apple MacBook Air";
            case 1 -> "HP Spectre x360 14";
            case 2 -> "Asus ROG Zephyrus G15";
            case 3 -> "Asus Zenbook Pro Duo 14";
            default -> "";
        };
    }
    public static String getRandomDesktopModel(Random r){
        return switch (r.nextInt(0, 4)) {
            case 0 -> "iMac M1 2021";
            case 1 -> "Dell XPS 8950 Desktop";
            case 2 -> "HP Envy 34 All-in-One PC";
            case 3 -> "Origin PC 5000T";
            default -> "";
        };
    }
    public static @NotNull String getRandomPrice(Random r){
        return r.nextInt(5, 20)+"00 $";
    }
    public static @NotNull String getRandomBattery(Random r){
        return r.nextInt(5, 10)+" hours";
    }
    public static @NotNull String getRandomCamera(Random r){
        return r.nextInt(5, 80)/10.+" MP";
    }
    public static String getRandomCustomerChoice(Random r){
        return r.nextBoolean() ? Laptop.class.getSimpleName() : Desktop.class.getSimpleName();
    }
    public static String getRandomProgramBasedOnComputer(@NotNull String typeOfComputer){
        Random r = new Random();
        if (typeOfComputer.equals(Desktop.class.getSimpleName())){
            return switch (r.nextInt(0,4)){
                case 0 -> "Google Chrome";
                case 1 -> "Steam";
                case 2 -> "IntelliJ IDEA";
                case 3 -> "Teams";
                default -> "";
            };
        }else {
            return "Camera";
        }
    }
}
