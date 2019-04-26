package com.app.bean;
public class Car {
    private static String carname;

    public static String getCarname() {
        return carname;
    }

    public static void setCarname(String carname) {
        Car.carname = carname;
    }

    public static void Display(){
        System.out.println("CarName :"+carname);
    }

}
