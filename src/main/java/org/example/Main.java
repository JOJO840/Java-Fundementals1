package org.example;

public class Main {
    public static void main(String[] args) {
        String name = "Josip";
        String lastName = "Jovanovic";
        System.out.println(name + " " + lastName);
        printCar();

    } //Main Paragraph

    private static void printCar() {
        System.out.println("Hello World");
        System.out.println(Car.carBrand("BMW"));
        System.out.println(Car.regNumber("ABC123"));
        System.out.println(Car.maxSpeed(100));
        System.out.println(Car.ownerName("Josip"));
        System.out.println(Car.carColor("Blue"));
    }


}

